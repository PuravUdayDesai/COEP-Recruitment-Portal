import React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import OTP from "./otpForm";
import Register from "./register";
import Login from "./login";
import PersonalDetails from "./PersonalDetails";

class Routes extends React.Component {
  render() {
    return (
      <>
        <Router>
          <Switch>
            <Route exact path="/otpForm" component={OTP}></Route>
            <Route exact path="/" component={Register}></Route>
            <Route exact path="/login" component={Login}></Route>
            <Route
              exact
              path="/personalDetails"
              component={PersonalDetails}
            ></Route>
          </Switch>
        </Router>
      </>
    );
  }
}

export default Routes;
