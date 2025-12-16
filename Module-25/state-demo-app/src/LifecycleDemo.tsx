import React, { Component } from 'react';

interface Props {};

interface State {
    count: number;
  };

class LifecycleDemo extends Component<Props, State> {
  constructor(props: Props) {
    super(props);
    this.state = {
      count: 0,
    };
    console.log('Constructor: Component is being initialized');
  }

  // Lifecycle method called after the component is added to the DOM
  componentDidMount() {
    console.log('componentDidMount: Component has been mounted to the DOM');
  }

  // Lifecycle method called after the component updates
  componentDidUpdate(prevProps: Props, prevState: State) {
    console.log('componentDidUpdate: Component has been updated');
  }

  // Lifecycle method called just before the component is removed from the DOM
  componentWillUnmount() {
    console.log('componentWillUnmount: Component is about to be removed from the DOM');
  }

  increment = () => {
    this.setState((prevState) => ({
      count: prevState.count + 1,
    }));
  };

  render() {
    console.log('Render: Component is rendering');
    return (
      <div>
        <h1>Lifecycle Demo</h1>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
      </div>
    );
  }
}

export default LifecycleDemo;
