import React from 'react';
import PropTypes from 'prop-types';
import {Switch, Route, useRouteMatch} from 'react-router-dom';
import ProductListEditor from './pages/ProductListEditor';
import ProductFormEditor from './pages/ProductFormEditor';

Product.propTypes = {
  
};

function Product(props) {
  const match = useRouteMatch();
  return (
    <Switch>
      <Route exact path={match.url} component={ProductListEditor}/>
      <Route path={`${match.url}/:code`} component={ProductFormEditor}/>
    </Switch>
  );
}

export default Product;