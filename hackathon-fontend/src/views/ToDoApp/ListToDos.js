import React from 'react'
import './style.scss'
import AddToDo from './AddToDo'
import ShowToDo from './ShowToDo'
import {toast } from 'react-toastify';


class ListoDos extends React.Component{

    state = {
        listToDo:[
            {id: 1, title: "Play game"},
            {id: 2, title: "Learn japanese"},
            {id: 3, title: "Code project"},
        ]
    }

    addToDo = (toDo) => {
        this.setState({
            listToDo:[...this.state.listToDo, toDo]
        })
        toast.success('Thêm thành công!')
    }

    deleteToDo = (toDo) => {
        let currentList = this.state.listToDo
        currentList = currentList.filter((item) => item.id !== toDo.id)
        this.setState({
            listToDo:currentList
        })
        toast.info('Xóa thành công!')
    }

    updateToDo = (toDo) => {
        
    }

    render() {

        return (
            <>
                <div className='container'>
                    <AddToDo
                        addToDo = {this.addToDo}
                    />
                    <ShowToDo
                        listToDo = {this.state.listToDo}
                        deleteToDo = {this.deleteToDo}
                    />
                </div>
            </>
        )
    }
}

export default ListoDos