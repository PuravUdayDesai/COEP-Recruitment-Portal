import React from "react";
import "./register.css";
import Header from "./header";
import $ from "jquery";
import { UserDetails } from '../user.js'

class Register extends React.Component {
  render() {
    return (
      <>
        <body>
          <Header></Header>
          <div class="container">
            <div class="row">
              <div class="col"></div>
              <div class="col-sm-8">
                <br></br>
                <br></br>
                <br></br>
                <p>
                  Enter your email-id and contact number to register yourself
                </p>
                <br></br>
                <br></br>
                <div class="form-floating">
                  <input
                    type="email"
                    class="form-control"
                    id="userEmail"
                    placeholder="Email-ID"
                  ></input>
                </div>
                <br></br>

                <div class="form-floating">
                  <input
                    type="text"
                    class="form-control"
                    pattern="[7-9]{1}[0-9]{9}"
                    id="userContact"
                    placeholder="Contact"
                  ></input>
                </div>
                <br></br>
                <br></br>
                <br></br>
                <button
                  type="submit"
                  id="btn_register"
                  class="btn btn-primary btn-lg"
                >
                  Register
                </button>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
              </div>
              <div class="col"></div>
            </div>
          </div>
        </body>
      </>
    );
  }
}

$(document).ready(function () {
  $("#btn_register").click(function () {
    var settings = {
      "async": true,
      "url": "http://localhost:8080/applicant",
      "method": "POST",
      "timeout": 0,
      "headers": {
        "Content-Type": "application/json",
        "Accept": "application/json"
      },
      "data": JSON.stringify({
          "emailId": $("#userEmail").val(),
          "contactNumber": $("#userContact").val()
      }),
      "processData": false
    };
  
    $.ajax(settings).done(function (response) {

      sessionStorage.setItem("EmailId", response.username);
      sessionStorage.setItem("ContactNumber", response.contactNumber);
      sessionStorage.setItem("EmailVerificationToken", response.emailVerificationToken);

      window.open("/otpForm", "_self");

    });
  });
});

export default Register;
