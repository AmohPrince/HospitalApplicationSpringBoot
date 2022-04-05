import React, { useEffect } from "react";
import moment from "moment";
import Assets from "../../../Assets/Assets";
import "./Date.css";

const getCurrentTimes = () => {
  return;
};

let currentDate = moment().format("d MMMM YYYY");
let currentTime = moment().format(" h:mm:ss ");
let amOrPm = moment().format("a");

const Date = () => {
  useEffect(() => {}, []);
  return (
    <div className="Date flex__container-v">
      {amOrPm === "pm" ? (
        <div className="Moon__icon flex__container">
          <img src={Assets.Moon} alt="Moon Icon" />
          <p className="p__poppins Date__greeting">Good Evening</p>
        </div>
      ) : (
        <div className="Sun__icon flex__container">
          <img src={Assets.Sun} alt="Sun Icon" />
          <p className="p__poppins Date__greeting">Good Morning</p>
        </div>
      )}
      <div className="Date__btm flex__container">
        <p className="p__poppins">{currentDate}</p>
        <p className="p__poppins">{currentTime}</p>
      </div>
    </div>
  );
};

export default Date;
