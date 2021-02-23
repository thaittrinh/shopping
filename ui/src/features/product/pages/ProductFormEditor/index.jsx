import React, {useState, useEffect} from 'react';
import PropTypes from 'prop-types';
import productApi from 'api/productApi';
import { useHistory, useParams } from 'react-router-dom';
import ProductForm from 'features/product/components/ProductForm';

ProductFormEditor.propTypes = {
  
};

function ProductFormEditor(props) {
  const [product, setProduct] = useState({});
  const { code } = useParams();

  useEffect(() => {
    const fetchProduct = async() => {
      try { 
       const product = await productApi.getProduct(code);
       setProduct(product);
      } catch (error) {
        console.log('Failed to fetch product', error);
      }
    };

    fetchProduct();
  }, [])
  
  return (
    <>
      <h5>Product info: {product.code}</h5>
      <ProductForm product={product}/>
    </>
   
  );
}

export default ProductFormEditor;