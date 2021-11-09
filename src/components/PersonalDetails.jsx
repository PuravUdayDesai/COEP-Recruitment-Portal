import React from "react";
import "./PersonalDetails.css";
import Header_In from "./header_in";
import $ from "jquery";

class PersonalDetails extends React.Component {
  constructor(props) {
    super(props);
    this.state = { file: null };
    this.onChange = this.onChange.bind(this);
    this.resetFile = this.resetFile.bind(this);
  }
  onChange(event) {
    this.setState({
      file: URL.createObjectURL(event.target.files[0]),
    });
  }

  resetFile(event) {
    event.preventDefault();
    this.setState({ file: null });
  }

  render() {
    return (
      <>
        <body>
          <Header_In></Header_In>
          <div id="pd_cont">
            <div class="row" id="for_col">
              <div class="col-2" id="c1">
                <ul class="nav flex-column">
                  <li class="nav-item">
                    <a class="nav-link" href="/personalDetails">
                      Personal Details
                    </a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#">
                      Educational Details
                    </a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#">
                      Extra Curricular
                    </a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link disabled">Experience</a>
                  </li>
                </ul>
              </div>
              <div class="col-10" id="c2">
                <div>
                  <div class="row" id="for_inCol1">
                    <div class="col-10" id="inCol1">
                      <div class="container">
                        <div class="row">
                          <div class="col">
                            <div class="form-floating">
                              <input
                                type="text"
                                class="form-control"
                                id="first_Name"
                                placeholder="First Name"
                              ></input>
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-floating">
                              <input
                                type="text"
                                class="form-control"
                                id="middle_Name"
                                placeholder="Middle Name"
                              ></input>
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-floating">
                              <input
                                type="text"
                                class="form-control"
                                id="last_Name"
                                placeholder="Last Name"
                              ></input>
                            </div>
                          </div>
                        </div>

                        <div class="row" id="row2">
                          <div class="col">
                            <div class="form-floating">
                              <select class="form-control" id="select_Gender">
                                <option value="Male" selected>Male</option>
                                <option value="Female">Female</option>
                              </select>
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-floating">
                              <select class="form-control" id="marital_Status">
                                <option value="Married" selected>Married</option>
                                <option value="Unmarried">Unmarried</option>
                              </select>
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-floating">
                              <input
                                type="text"
                                class="form-control"
                                pattern="[7-9]{1}[0-9]{9}"
                                placeholder="Contact"
                                id="pd_Contact"
                                readOnly
                              ></input>
                            </div>
                          </div>
                        </div>

                        <div class="row" id="row3">
                          <div class="form-floating">
                            <input
                              type="email"
                              class="form-control"
                              id="pd_Email"
                              placeholder="Email-ID"
                              readOnly
                            ></input>
                          </div>
                        </div>

                        <div class="row" id="row4">
                          <div class="col">
                            <div class="form-floating">
                              <div class="datepicker date" id="dp">
                                <input
                                  type="date"
                                  class="form-control"
                                  id="BirthDate"
                                ></input>
                              </div>
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-floating">
                              <div class="custom-file">
                                <input
                                  type="file"
                                  class="custom-file-input"
                                  id="birthCertificate"
                                ></input>
                                <label
                                  class="custom-file-label selected"
                                  for="birthCertificate"
                                  id="fileLabel"
                                >
                                  Upload birth Certificate
                                </label>
                              </div>
                            </div>
                          </div>
                          <div class="col"></div>
                        </div>
                      </div>
                    </div>
                    <div class="col-2" id="inCol2">
                      {/* {this.state.file && (
                        <div style={{ textAlign: "center" }}>
                          <button onClick={this.resetFile}>Remove File</button>
                        </div>
                      )} */}
                      <img
                        style={{ width: "100%" }}
                        src={this.state.file}
                        id="profileimg"
                      />
                      {/* <input type="file" onChange={this.onChange} /> */}
                      <div class="custom-file">
                        <input
                          type="file"
                          class="custom-file-input"
                          id="profile"
                          onChange={this.onChange}
                        ></input>
                        <label
                          class="custom-file-label selected"
                          for="profile"
                          id="photolabel"
                        >
                          Upload Photo
                        </label>
                      </div>
                    </div>
                  </div>
                  <div class="row" id="for_inCol2">
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="cur_Add1"
                          placeholder="Current Address Line 1"
                        ></input>
                      </div>
                    </div>
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="per_Add1"
                          placeholder="Permanent Address Line 1"
                        ></input>
                      </div>
                    </div>
                  </div>
                  <div class="row" id="for_inCol2">
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="cur_Add2"
                          placeholder="Current Address Line 2"
                        ></input>
                      </div>
                    </div>
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="per_Add2"
                          placeholder="Permanent Address Line 2"
                        ></input>
                      </div>
                    </div>
                  </div>
                  <div class="row" id="for_inCol2">
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="cur_Add3"
                          placeholder="Current Address Line 3"
                        ></input>
                      </div>
                    </div>
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="text"
                          class="form-control"
                          id="per_Add3"
                          placeholder="Permanent Address Line 3"
                        ></input>
                      </div>
                    </div>
                  </div>
                  <div class="row" id="for_inCol2">
                    <div class="col"></div>
                    <div class="col">
                      <div class="form-floating">
                        <input
                          type="checkbox"
                          value=""
                          id="flexCheckDefault"
                        ></input>
                        <label for="flexCheckDefault" id="checkbox_Label">
                          Same as current address
                        </label>
                      </div>
                    </div>
                  </div>
                  <div class="row" id="for_inCol3">
                    <button
                      type="submit"
                      id="btn_Personal_Details"
                      class="btn btn-primary btn-lg"
                    >
                      Save and Next
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </body>
      </>
    );
  }
}

$(document).ready(function () {

//  document.getElementById("pd_Email").value = sessionStorage.getItem("EmailId");
//  document.getElementById("pd_Contact").value = sessionStorage.getItem("ContactNumber");

  $("#btn_Personal_Details").click(function () {

    if (sessionStorage.getItem("ApplicantId") != null && sessionStorage.getItem("Authorization") != null) {
      console.log("here");
      var settings = {
        "async": true,
        "url": "http://localhost:8080/applicant/personalDetails/" + sessionStorage.getItem("ApplicantId"),
        "method": "POST",
        "timeout": 0,
        "headers": {
          "Content-Type": "application/json",
          "Accept": "application/json",
          "Authorization": sessionStorage.getItem("Authorization")
        },
        "data": JSON.stringify({
          "firstName": $("#first_Name").val(),
          "middleName": $("#middle_Name").val(),
          "lastName": $("#last_Name").val(),
          "gender": $("#select_Gender").val() == "Male" ? true : false,
          "maritalStatus": $("#marital_Status").val() == "Married" ? true : false,
          "dateofBirth": $("#BirthDate").val() + " 00:00:00",
          "permanentAddressLine1": $("#per_Add1").val(),
          "permanentAddressLine2": $("#per_Add2").val(),
          "permanentAddressLine3": $("#per_Add3").val(),
          "currentAddressLine1": $("#cur_Add1").val(),
          "currentAddressLine2": $("#cur_Add2").val(),
          "currentAddressLine3": $("#cur_Add3").val()
        }),
        "processData": false
      };

      $.ajax(settings).done(function (response) {

        console.log(response);
        if(response.operationResult == "SUCCESS")
        {
          var form = new FormData();
          form.append("file", document.getElementById("birthCertificate").files[0]);

          var settings = {
              "async": true,
              "url": "http://localhost:8080/applicant/upload/dateofBirthProof/" + sessionStorage.getItem("ApplicantId"),
              "method": "POST",
              "timeout": 0,
              "processData": false,
              "mimeType": "multipart/form-data",
              "headers": {
                "Authorization": sessionStorage.getItem("Authorization")
              },
              "contentType": false,
              "data": form
          };
          $.ajax(settings).done(function(data, statusText, xhr) {
              if (xhr.status == 200) {
                var formNew = new FormData();
                formNew.append("file", document.getElementById("profile").files[0]);
      
                var settings = {
                    "async": true,
                    "url": "http://localhost:8080/applicant/upload/applicantImage/" + sessionStorage.getItem("ApplicantId"),
                    "method": "POST",
                    "timeout": 0,
                    "processData": false,
                    "mimeType": "multipart/form-data",
                    "headers": {
                      "Authorization": sessionStorage.getItem("Authorization")
                    },
                    "contentType": false,
                    "data": formNew
                };
                $.ajax(settings).done(function(data, statusText, xhr) {
                    if (xhr.status == 200) {
                      console.log("All Image Uploaded");
                      alert("Registration Completed");
                    }
                });
              }
          });
        }
        //window.open("/otpForm", "_self");

      });
    }

  });

  // // INITIALIZE DATEPICKER PLUGIN
  // $(".datepicker").datepicker({
  //   clearBtn: true,
  //   format: "dd/mm/yyyy",
  // });

  // // FOR DEMO PURPOSE
  // $("#reservationDate").on("change", function () {
  //   var pickedDate = $("input").val();
  //   $("#pickedDate").html(pickedDate);
  // });
  $("#birthCertificate").on("change", function () {
    var fileName = $("#birthCertificate")[0].files[0]; // This gets the file
    console.log(fileName["name"]);
    $("#birthCertificate")
      .siblings("#fileLabel")
      .addClass("selected")
      .html(fileName["name"]);
  });

  $("#profile").on("change", function () {
    var fileName = $("#profile")[0].files[0]; // This gets the file
    console.log(fileName["name"]);
    $("#profile")
      .siblings("#photolabel")
      .addClass("selected")
      .html(fileName["name"]);
  });
});

export default PersonalDetails;
