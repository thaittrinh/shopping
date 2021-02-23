import Aside from 'components/Aside';
import Header from 'components/Header';
import Product from 'features/product'

import {
  BrowserRouter as Router,
  Switch,
  Route,
  Redirect,
  Link
} from "react-router-dom";

import './App.css';
import './fontawesomeIcon'

function App() {
  return (
    <Router>
      <div className="d-flex h-100">
        <Aside />
        <div className="flex-column w-100 p-2">
          <Header />
          <div className="h-100">
            <Switch>
              <Redirect exact from="/" to="/products" />
              <Route path="/products" component={Product} />
              {/* <Route path="/customers" component={CustomerList} /> */}
            </Switch>
          </div>
        </div>
      </div>
    </Router>
  );
}

export default App;
