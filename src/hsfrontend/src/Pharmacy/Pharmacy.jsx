import React, { useEffect, useState, useContext } from "react";
import "./Pharmacy.css";
import Assets from "../Assets/Assets";
import Date from "./Components/Date/Date";
import ProfileOn from "./Components/ProfileOn/ProfileOn";
import RightTab from "./Components/RightTab/RightTab";
import { act } from "react-dom/test-utils";

/*The logo may be dynamic . Like on user upload it should change necessarilly
same as the name*/
/* This user details are going to be dynamic. Find a way for the user to upload
their photo and name. The status will be computed */

const Pharmacy = () => {
  const [dashBoard, setDashBoard] = useState();
  const [inventory, setInventory] = useState();
  const [reports, setReports] = useState();
  const [configuration, setConfiguration] = useState();
  const [contact, setContact] = useState();
  const [notifications, setNotifications] = useState();
  const [chat, setChat] = useState();
  const [application, setApplication] = useState();
  const [covid, setCovid] = useState();
  const [techHelp, setTechHelp] = useState();

  const [onTab, setOnTab] = useState("");

  useEffect(() => {
    findElements();
  }, []);

  const toggleProfile = () => {
    const profile = document.querySelector(".User__details-showprofile");
    profile.classList.toggle("active");
  };

  const findElements = () => {
    setDashBoard(document.querySelector(".Dashboard"));
    setInventory(document.querySelector(".Inventory"));
    setReports(document.querySelector(".Reports"));
    setConfiguration(document.querySelector(".Configuration"));
    setContact(document.querySelector(".Contact"));
    setNotifications(document.querySelector(".Notifications"));
    setChat(document.querySelector(".Chat"));
    setApplication(document.querySelector(".Application"));
    setCovid(document.querySelector(".Covid-19"));
    setTechHelp(document.querySelector(".Get"));
  };

  const handleDashBoardClick = () => {
    dashBoard.classList.toggle("active");
    setOnTab("dash");
  };
  const handleInventoryClick = () => {
    inventory.classList.toggle("active");
    setOnTab("invent");
  };
  const handleReportsClick = () => {
    reports.classList.toggle("active");
    setOnTab("repo");
  };
  const handleContactManagementClick = () => {
    contact.classList.toggle("active");
    setOnTab("cont");
  };

  const handleConfigurationClick = () => {
    configuration.classList.toggle("active");
    setOnTab("conf");
  };

  const handleNotificationsClick = () => {
    notifications.classList.toggle("active");
    setOnTab("not");
  };

  const handleChatClick = () => {
    chat.classList.toggle("active");
    setOnTab("chat");
  };

  const handleSettingsClick = () => {
    application.classList.toggle("active");
    setOnTab("set");
  };

  const handleCovidClick = () => {
    covid.classList.toggle("active");
    setOnTab("cov");
  };

  const handleTechnicalClick = () => {
    techHelp.classList.toggle("active");
    setOnTab("tech");
  };

  const dataArray = [
    {
      name: "Dashboard",
      icon: Assets.Dashboard,
      dropDown: false,
      onClick: handleDashBoardClick,
    },
    {
      name: "Inventory",
      icon: Assets.Inventory,
      dropDown: true,
      onClick: handleInventoryClick,
    },
    {
      name: "Reports",
      icon: Assets.Reports,
      dropDown: true,
      onClick: handleReportsClick,
    },
    {
      name: "Configuration",
      icon: Assets.Configuration,
      dropDown: false,
      onClick: handleConfigurationClick,
    },
    {
      name: "Contact Management",
      icon: Assets.ContactIco,
      dropDown: true,
      onClick: handleContactManagementClick,
      topLine: true,
    },
    {
      name: "Notifications",
      icon: Assets.Bell,
      dropDown: false,
      onClick: handleNotificationsClick,
    },
    {
      name: "Chat With Others",
      icon: Assets.ChatIco,
      dropDown: false,
      onClick: handleChatClick,
    },
    {
      name: "Application Settings",
      icon: Assets.SettingsIco,
      dropDown: false,
      onClick: handleSettingsClick,
      spaceBelow: true,
    },
    {
      name: "Covid-19",
      icon: Assets.CovidIco,
      dropDown: false,
      onClick: handleCovidClick,
    },
    {
      name: "Get Technical Help",
      icon: Assets.QuestionIco,
      dropDown: false,
      onClick: handleTechnicalClick,
    },
  ];
  return (
    <div className="Pharmacy ">
      {/* Aside Section Begins Here */}
      <aside className="Pharmacy__sidebar">
        <div className="Logo__container flex__container">
          <img src={Assets.Logo} alt="Logo" />
          <div className="logo__name">
            <p className="p__poppins">Pharma One</p>
          </div>
        </div>

        <div className="Pharmacy__sidebar-body">
          {/* User Details */}
          <div className="User__details flex__container">
            <div className="User__details-right flex__container">
              <div className="User__details-img">
                <img src={Assets.Photo} alt="Profile Pic" />
                <img src={Assets.OnlineIcon} alt="Online /Offline" />
              </div>
              <div className="User__details-names">
                <p className="p__poppins">Subash</p>
                <p className="p__poppins">Super Admin</p>
              </div>
            </div>
            <div
              className="User__details-icons flex__container"
              onClick={toggleProfile}
            >
              <img src={Assets.ThreeDots} alt="Dots Icon" />
              <div className="User__details-showprofile ">
                <ProfileOn />
              </div>
            </div>
          </div>
          {dataArray.map((data) => (
            <RightTab data={data} key={data.name} onTab={onTab} />
          ))}
        </div>
      </aside>
      {/* Right section begins here */}
      <div className="Pharmacy__right">
        <div className="Pharmacy__topbar flex__container">
          <div className="Topbar__input flex__container">
            <input
              type="search"
              name="Search"
              id="Search"
              placeholder="Search for anything here."
              className="p__poppins"
            />
            <img src={Assets.Search} alt="Search Icon" />
          </div>

          <div className="Topbar__changelang flex__container ">
            <img src={Assets.Lang} alt="Language Translate Icon" />
            <select name="ChangeLang" id="ChangeLang" className="p__poppins">
              <optgroup className="optgroup ">
                <option value="English" className="Option">
                  English (US)
                </option>
                <option value="French" className="Option">
                  French
                </option>
              </optgroup>
            </select>
          </div>
          <div className="Topbar__date">
            <Date />
          </div>
        </div>

        <div className="Pharmacy__body">
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsam
          quisquam totam nisi deserunt perspiciatis rerum animi, possimus dolor
          magnam voluptas tempore ullam facere explicabo? Nulla non laborum
          iusto dolorem eligendi!
        </div>
      </div>
    </div>
  );
};

export default Pharmacy;
