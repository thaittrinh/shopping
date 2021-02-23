import React from 'react';
import ProductList from 'features/product/components/ProductList'
import PropTypes from 'prop-types';
import { Card, CardBody, CardFooter, Button }from 'reactstrap'
ProductListEditor.propTypes = {
  
};

function ProductListEditor(props) {
  return (
     <Card>
      <CardBody><ProductList /></CardBody>
      <CardFooter className="d-flex justify-content-end" >
        <Button className="mr-1" type="submit" color='primary'>New Product</Button>
      </CardFooter>
    </Card>
  );
}

export default ProductListEditor;