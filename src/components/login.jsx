import React from "react";
import "./register.css";
import Header_Log from "./header_log";
import $ from "jquery";

class Login extends React.Component {
  render() {
    return (
      <>
        <body>
          <Header_Log></Header_Log>
          <div class="container">
            <div class="row">
              <div class="col"></div>
              <div class="col-sm-8">
                <br></br>
                <br></br>
                <br></br>
                <h2>Please Login</h2>
                <p>Enter the password sent to your registered email-id</p>
                <br></br>
                <br></br>
                <div class="form-floating">
                  <input
                    type="email"
                    class="form-control"
                    id="floatingInput"
                    placeholder="Username/Email-ID"
                  ></input>
                </div>
                <br></br>

                <div class="form-floating">
                  <input
                    type="password"
                    class="form-control"
                    id="floatingPassword"
                    placeholder="Password"
                  ></input>
                </div>
                <br></br>
                <br></br>
                <br></br>
                <button
                  type="submit"
                  id="btn_login"
                  class="btn btn-primary btn-lg"
                >
                  Login
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
  $("#btn_login").click(function () {

    $.ajax({
      type: "POST",
      data: JSON.stringify({
        "username": $("#floatingInput").val(),
        "password": $("#floatingPassword").val()
      }),
      url: "http://localhost:8080/applicant/login",
      success: function (output, status, xhr) {
        console.log("Authorization: " + output.authorization);
        console.log("ApplicantId: " + output.applicantId);

        sessionStorage.setItem("Authorization", output.authorization);
        sessionStorage.setItem("ApplicantId", output.applicantId);

        window.open("/PersonalDetails", "_self");

      },
      error: function (output) {
        console.log("Error in API call " + output);
      }
    });
  });
});

export default Login;
