import http from '../http-common';

const upload = (file, onUploadProgress) => {
  let formData = new FormData();
  formData.append('file', file);
  console.log(formData);

  return http.post('/upload', formData, {
    header: {
      'Context-Type': 'multipart/form-data',
    },
    onUploadProgress,
  });
};

const getFiles = () => {
  return http.get('/files');
};

export default {
  upload,
  getFiles,
};
