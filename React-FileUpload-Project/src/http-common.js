import axios from 'axios';

export default axios.create({
  baseURL: 'http://localhost:9090',
  headers: {
    'Context-type': 'application/json',
  },
});