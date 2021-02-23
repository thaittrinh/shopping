import React, { useEffect, useState } from 'react';
import productApi from 'api/productApi';
import { Table } from 'reactstrap';
import PropTypes from 'prop-types';
import { Button } from 'reactstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {
  useHistory
} from "react-router-dom";

ProductList.propTypes = {
  
};

function ProductList(props) {
  const history = useHistory();

  const [productList, setProductList] = useState([]);

  useEffect( () => {
    const fetchProductList = async() => {
      try {
        const productList = await productApi.getAll();
        setProductList(productList);
      } catch (error) {
        console.log('Failed to fetch product list', error);
      }
    };
    fetchProductList();
  }, [])

  let onEdit = (code) => {
    history.push(`/products/${code}`)
  }

  return (
    <div>
      <h5>All Products</h5>
      <Table>
        <thead>
          <tr>
            <th>Code</th>
            <th>Label</th>
            <th>Name</th>
            <th>Price</th>
            <th>Discription</th>
            <th>Update</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          {
            productList.map(product => 
              <tr key={product.id}>
                <th scope="row">{product.code}</th>
                <td>{product.label}</td>
                <td>{product.name}</td>
                <td>{product.price}</td>
                <td>{product.discription}</td>
                <td><Button color="primary" onClick={() => onEdit(product.code)}><FontAwesomeIcon icon="pen" className='mr-1' />Edit</Button></td>
                <td><Button color="danger"><FontAwesomeIcon icon="trash-alt" className='mr-1' />Delete</Button></td>
            </tr>
            )
          }
        </tbody>
      </Table>
    </div>
   
  );
}

export default ProductList;