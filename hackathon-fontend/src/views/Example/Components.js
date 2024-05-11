import React from 'react';
import ChildComponents from './ChildComponents';
import AddComponents from './AddComponents';

class Components extends React.Component{

    state = {
        arrJobs: [
            {id: 'job 1', titleJob: 'developer', salary: '500'},
            {id: 'job 2', titleJob: 'tester', salary: '400'},
            {id: 'job 3', titleJob: 'leader', salary: '600'}
        ]
    }

    addJob = (job) => {
        this.setState({
            arrJobs: [...this.state.arrJobs, job]
        })
        // console.log(this.state.arrJobs);
    }

    deleteJob = (job) => {
        let currentJobs = this.state.arrJobs
        currentJobs = currentJobs.filter((item) => item.id !== job.id)
        this.setState({
            arrJobs: currentJobs
        })
    }

    render(){ 
        return (
            <>
            <AddComponents
            addJob = {this.addJob}
            />

            <ChildComponents 
            arrJobs = {this.state.arrJobs}
            deleteJob = {this.deleteJob}
            />
            </>
        );
    }

}

export default Components;