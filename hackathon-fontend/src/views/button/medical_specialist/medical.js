import React from "react";
import './medical_specialist';

class Medical extends React.Component{

    render(){
        return(
            <div className="medical">
                <div className="background">
                    <div className="img" style={{ backgroundImage: `url(${this.props.url})`}}></div>
                </div>
                <h3 className="name">{this.props.name}</h3>
                <p className="information">{this.props.information}</p>
            </div>
        )
    }

}

export default Medical


