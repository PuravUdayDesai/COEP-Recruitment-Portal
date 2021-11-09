import React from "react";
import "./register.css";
import Header from "./header";
import $ from "jquery";
import { UserDetails } from '../user.js'

class OTP extends React.Component {
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
                  Please enter OTP sent to your registered mobile/email to
                  verify it.
                </p>
                <br></br>
                <br></br>

                <div class="form-floating">
                  <input
                    id="OTPField"
                    type="text"
                    class="form-control"
                    pattern="[7-9]{1}[0-9]{9}"
                    placeholder="OTP"
                  ></input>
                </div>
                <br></br>
                <br></br>
                <br></br>
                <button
                  type="button"
                  id="btn_verify"
                  class="btn btn-primary btn-lg"
                >
                  Verify
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
  $("#btn_verify").click(function () {

    
    if($("#OTPField").val() == sessionStorage.getItem("EmailVerificationToken"))
    {
      window.open("/login", "_self");
    }
  });
});

export default OTP;
