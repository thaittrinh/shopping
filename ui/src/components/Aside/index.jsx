import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import PropTypes from 'prop-types';
import logo from 'img/admin_logo.jpg';

import "./Aside.css"
import { Link } from 'react-router-dom';

const Aside = props => {

  return (
    <div className="aside h-100">
      <div>
      <strong><FontAwesomeIcon icon="align-left" className='mr-1' />Admin App</strong>
      </div>
      <ul style={{ listStyleType: "none" }}>
         <li><Link to="/customers" >Customers</Link></li>
         <li><Link to="/products" >Products</Link></li>
      </ul>
    </div>
  );
};

Aside.propTypes = {
  
};

export default Aside;
