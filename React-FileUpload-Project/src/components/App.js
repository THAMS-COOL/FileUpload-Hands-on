import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import FileUpload from './FileUpload';

const App = () => {
  return (
    <div className="container" style={{ width: '600px' }}>
      <div className="my-3">
        <h3>Thams.com</h3>
        <h4>React Hooks File Upload</h4>
      </div>

      <FileUpload />
    </div>
  );
};

export default App;
