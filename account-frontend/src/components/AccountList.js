import React, { useState, useEffect } from 'react';
import axios from 'axios';

function AccountList() {
  const [accounts, setAccounts] = useState([]);
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  useEffect(() => {
    fetchAccounts();
  }, []);

  const fetchAccounts = async () => {
    const response = await axios.get('http://localhost:8080/api/accounts');
    setAccounts(response.data);
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios.post('http://localhost:8080/api/accounts', { name, email });
    setName('');
    setEmail('');
    fetchAccounts();
  };

  return (
    <div>
      <h1>Account List</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <input
            type="text"
            placeholder="Name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div>
          <input
            type="email"
            placeholder="Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <button type="submit">Add Account</button>
      </form>
      <ul>
        {accounts.map((account) => (
          <li key={account.id}>
            {account.name} - {account.email}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default AccountList;
