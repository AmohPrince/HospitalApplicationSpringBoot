import React from "react";
import "./Dashboard.css";
import SectionName from "../../Components/SectionName/SectionName";

const Dashboard = () => {
  const title = {
    main: "Dashboard",
    sub: "A quick data overview of the inventory",
  };
  return (
    <div className="Dashboard__container">
      <div className="Dashboard__top">
        <SectionName title={title} />
      </div>
      <div className="Dashboard__bottom"></div>
    </div>
  );
};

export default Dashboard;
