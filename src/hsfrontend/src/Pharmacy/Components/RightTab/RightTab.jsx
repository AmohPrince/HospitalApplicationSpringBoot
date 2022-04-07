import React, { useState } from "react";
import "./RightTab.css";
import Assets from "../../../Assets/Assets";
import { act } from "react-dom/test-utils";

/*This component is lives in the left section. It will take an object containg an 
icon a name and a boolean whether or not there is a dropdown. 
*/
const RightTab = ({ data, activeTab }) => {
  return (
    <div className="dashboard inventory reports">
      <div className={`RightTab flex__container`} onClick={data.onClick}>
        <img src={data.icon} alt="Dashboard Icon" />
        <p className="p__poppins">{data.name}</p>
        {data.dropDown === true ? (
          <div className="dropdown__icon">
            <img src={Assets.Arrow} alt="Arrow" />
          </div>
        ) : (
          <div className="nothing"></div>
        )}
      </div>
    </div>
  );
};

export default RightTab;
