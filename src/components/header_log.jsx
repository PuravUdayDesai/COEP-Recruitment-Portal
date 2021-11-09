import React from "react";
import coep_logo from "../images/coep_logo.png";
import "./header.css";
import $ from "jquery";

class header_log extends React.Component {
  render() {
    return (
      <nav class="navbar-custom">
        <a class="navbar-brand">
          <img src={coep_logo} width="700" height="100" alt=""></img>
        </a>
        <a class="navbar-brand">
          <button type="button" class="btn btn-primary btn-lg" id="nav_reg">
            Register
          </button>
        </a>
      </nav>
    );
  }
}

$(document).ready(function () {
  $("#nav_reg").click(function () {
    window.open("/", "_self");
  });
});

export default header_log;
