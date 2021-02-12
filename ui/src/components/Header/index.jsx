import React from 'react';
import {
  Nav,
  NavItem,
  NavLink,
  UncontrolledDropdown,
  DropdownToggle,
  DropdownMenu,
  DropdownItem
} from 'reactstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import './Header.css';

const Header = () => {
  return (
    <div className="w-100 border-bottom">
      <Nav className="justify-content-end ">
        <UncontrolledDropdown nav inNavbar>
          <DropdownToggle nav caret>
            <FontAwesomeIcon icon="user" className='mr-1' />My Account
          </DropdownToggle>
          <DropdownMenu right>
            <DropdownItem>
             Profile
            </DropdownItem>
            <DropdownItem>
              Change password
            </DropdownItem>
            <DropdownItem divider />
            <DropdownItem>
              <FontAwesomeIcon icon="sign-out-alt" className='mr-1' />Logout
            </DropdownItem>
          </DropdownMenu>
        </UncontrolledDropdown>
      </Nav>
    </div>
  );
};

export default Header;