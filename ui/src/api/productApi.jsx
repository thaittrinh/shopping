
import axiosClient from 'api/axiosClient';

const productApi = {
  getAll: () => {
    const url = '/product/all';
    return axiosClient.post(url)
  },
  getProduct: (code) => {
    const url = `product/${code}`;
    return axiosClient.get(url)
  },
  saveProduct: (product)=> {
    const url = `product`;
    return axiosClient.put(url, product);
  }

}
export default productApi;