import React from "react";
import axios from "axios";

class DetailUser extends React.Component{

    state = {
        user: {}
    }

    async componentDidMount(){
        let id = window.location.href.split('users/')[1]
        let user = await axios.get(`https://reqres.in/api/users/${id}`)
        this.setState({
            user: user.data.data
        })
    }

    render(){

        return(
            <>
                { this.state.user  &&
                     <>
                     <div className='todo'>
                     <img src={this.state.user.avatar} alt="anh" width="80px" height="80px" style={{borderRadius: '50%'}}/>
                     </div>
                     <div className='todo'>
                         <span className='title'>First name : {this.state.user.first_name}</span>
                     </div>
                     <div className='todo'>
                         <span className='title'>Last name : {this.state.user.last_name}</span>
                     </div>
                     <div className='todo'>
                         <span className='title'> Email : {this.state.user.email}</span>
                     </div>
                     </>
                }
            </>
        )

    }

}

export default DetailUser;