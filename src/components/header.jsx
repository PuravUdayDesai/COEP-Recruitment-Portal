import React from "react";
import coep_logo from "../images/coep_logo.png";
import "./header.css";
import $ from "jquery";

class header extends React.Component {
  render() {
    return (
      <nav class="navbar-custom">
        <a class="navbar-brand">
          <img src={coep_logo} width="700" height="100" alt=""></img>
        </a>
        <a class="navbar-brand">
          <button type="button" class="btn btn-primary btn-lg" id="nav_login">
            Login
          </button>
        </a>
      </nav>
    );
  }
}

$(document).ready(function () {
  $("#nav_login").click(function () {
    window.open("/login", "_self");
  });
});

export default header;
