import React, { useState, useEffect } from 'react';
import axios from 'axios';


function Work() {

    const [tableData, setTableData] = useState([]);
  
    useEffect(() => {
      async function fetchData() {
        const response = await axios.get(`http://localhost:8080/work/get-work-inclass/${1}`);
        setTableData(response.data);
      }
      fetchData();
    }, []); 
  
    return (
      tableData.map((item, index) => (
        <a href="#" className="block max-w-sm p-6 bg-white border border-gray-200 rounded-lg shadow hover:bg-gray-100 dark:bg-gray-800 dark:border-gray-700 dark:hover:bg-gray-700">
          <h5 className="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white">{item.topic}</h5>
          <p className="font-normal text-gray-700 dark:text-gray-400">{item.docPath}</p>
          <p className="font-normal text-gray-700 dark:text-gray-400">{item.createdDate}</p>
        </a>
      ))
    );
  }
  
  export default Work