import React from "react";
import './standing_hospital.scss';

class Hospital extends React.Component{

    render(){
        return(
            <div className="hospital">
                <div className="img" style={{ backgroundImage: `url(${this.props.url})`}}></div>
                <h2 className="name">{this.props.name}</h2>
                <p className="information">{this.props.information}</p>
                <div className="arrowright"></div>
            </div>
        )
    }

}

export default Hospital


