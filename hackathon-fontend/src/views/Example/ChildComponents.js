import React from 'react';

class ChildComponents extends React.Component{
    
    state = {
        showJobs: false
    }

    showHide = () => { 
        this.setState({ 
            showJobs: !this.state.showJobs
        })
    }

    handleDeleteJob = (job) => {
        this.props.deleteJob(job)
    }

    render(){ 
        // console.log(this.props);

        let {arrJobs} = this.props;// Cú pháp ngắn gọn 
        let {showJobs} = this.state;

        return (
            <>
                {showJobs === false ? <div><button onClick={() => this.showHide()}>Show</button></div>
                
                :
                    <>
                    <div>
                    {
                        arrJobs.map( (item, index) => {
                            return (
                                <div key={item.id}>
                                    {item.titleJob} - {item.salary} <></> <span onClick={() => this.handleDeleteJob(item)}>x</span>
                                </div>
                            )
                        })
                    }
                    </div>
                    <div><button onClick={() => this.showHide()}>Hide</button></div>
                    </>
                }
            </>
        );
    }

}

// const ChildComponents = (props) => {
//         let {name, age, arrJobs} = props;// Cú pháp ngắn gọn 

//         return (
//             <>
//                 <div>Child Components Name: {name}</div>
//                 <div>Child Components Age: {age}</div>
//                 <div>
//                     {
//                         arrJobs.map( (item, index) => {
//                             return (
//                                 <div key={item.id}>
//                                     {item.title} - {item.salary}
//                                 </div>
//                             )
//                         })
//                     }
//                 </div>
//             </>
//         );
// }

export default ChildComponents;