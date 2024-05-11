import React from "react";
import axios from "axios";
import '../ToDoApp/style.scss';
import { NavLink } from "react-router-dom";
// import {RouteMatch} from 'react-router-dom'

class ListUser extends React.Component{

    state = {
        listUser: []
    }

    async componentDidMount(){
        // axios.get('https://reqres.in/api/users')
        // .then(res => {
        //     console.log(res.data.data)
        // })
        let res = await axios.get('https://reqres.in/api/users');
        this.setState({
            listUser: res && res.data && res.data.data ? res.data.data : []
        })

    }

    render(){
        return (
            <>
                <div><h3>List User Get API From reqres.in</h3></div>
                <div className='list-todo'>
                    {this.state.listUser && this.state.listUser.length>0 && this.state.listUser.map( (item,index) => {
                        return (
                            <div key={item.id}>
                                <hr/>
                                    <div className='todo'>
                                        <NavLink to={'/users/'+item.id}>{index + 1}: {item.first_name}</NavLink>
                                    </div>
                                <hr/>
                            </div>
                        )
                    })}
                </div>
            </>
        )
    }

}

export default ListUser;