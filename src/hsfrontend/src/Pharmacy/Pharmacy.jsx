import React from "react";
import "./Pharmacy.css";
import Assets from "../Assets/Assets";
import Date from "./Components/Date/Date";
import ProfileOn from "./Components/ProfileOn/ProfileOn";

//The logo may be dynamic . Like on user upload it should change necessarilly
//same as the name

const toggleProfile = () => {
  const profile = document.querySelector(".User__details-showprofile");
  profile.classList.toggle("active");
};

const Pharmacy = () => {
  return (
    <div className="Pharmacy ">
      <aside className="Pharmacy__sidebar">
        <div className="Logo__container flex__container">
          <img src={Assets.Logo} alt="Logo" />
          <div className="logo__name">
            <p className="p__poppins">Pharma One</p>
          </div>
        </div>

        <div className="Pharmacy__sidebar-body">
          {/* This user details are going to be dynamic. Find a way for the user to upload
            their photo and name. The status will be computed */}

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
        </div>
      </aside>
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
