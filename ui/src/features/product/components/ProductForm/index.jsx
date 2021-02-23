import React, { useEffect, useState } from 'react';
import productApi from 'api/productApi';
import PropTypes from 'prop-types';
import { useHistory, useParams } from 'react-router-dom';
import { Col, Row, Button, Form, FormGroup, Label, Input } from 'reactstrap'

ProductForm.propTypes = {
  products: PropTypes.object
};

function ProductForm(props) {
  const [product, setProduct] = useState({});

  useEffect(() => {
    setProduct(props.product);
  }, [props.product])

  const handleChange = (event) => {
    const {name, value} = event.target;
    setProduct({...product, [name]: value});
  }

  const handleSubmit = (event) => {
    event.preventDefault();
    const saveProduct = async () => {
      try {
        const newProduct = await productApi.saveProduct(product);
        setProduct(newProduct);
        alert("Save success")
      } catch (error) { 
        alert("Save fail")
        console.log('Failed to save product', error)
      }
    }
    saveProduct();
  }

  return (
    <Form onSubmit={handleSubmit}>
      <Row form>
        <Col md={6}>
          <FormGroup>
            <Label for="code">Code</Label>
            <Input type="text" name="code" id="code" value={product.code} onChange={handleChange} placeholder="product code"/>
          </FormGroup>
        </Col>
        <Col md={6}>
          <FormGroup>
            <Label for="name">Name</Label>
            <Input type="text" name="name" id="name" value={product.name} onChange={handleChange} placeholder="product name" />
          </FormGroup>
        </Col>
      </Row>
      <Row form>
        <Col md={6}>
          <FormGroup>
            <Label for="label">Label</Label>
            <Input type="text" name="label" id="label" value={product.label} onChange={handleChange} placeholder="product label"/>
          </FormGroup>
        </Col>
        <Col md={6}>
          <FormGroup>
            <Label for="price">Price</Label>
            <Input type="text" name="price" id="price" value={product.price} onChange={handleChange} placeholder="product price"/>
          </FormGroup>
        </Col>
      </Row>
      <FormGroup>
        <Label for="description">Description</Label>
        <Input type="textarea" name="description" id="description"
          value={product.description} rows={10} onChange={handleChange} placeholder="product description"/>
      </FormGroup>

      <div className="d-flex justify-content-end">
        <Button className="mr-1" type="button" color="secondary">reset</Button>
        <Button className="mr-1" type="submit" color='primary'>Save</Button>
        <Button type="reset" color="secondary" >Clean</Button>
      </div>
    </Form>
  );
};

export default ProductForm;


