import React from "react";
import coep_logo from "../images/coep_logo.png";
import "./header.css";

class header_in extends React.Component {
  render() {
    return (
      <nav class="navbar-custom">
        <a class="navbar-brand">
          <img src={coep_logo} width="700" height="100" alt=""></img>
        </a>
      </nav>
    );
  }
}

export default header_in;
