import React from 'react';

import image1 from './13804312464_4656f62a1e_o_header.jpg';
import image2 from './518046941_50a9410063_o.jpg';
import image3 from './6928013157_2f1054eb54_o.jpg';
import image4 from './20161284852_3b5f293d7c_o.jpg';

import './App.css';

function App() {
  return (
      <div className="container-fluid">
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
          <a className="navbar-brand" href="/">Synthesizrs</a>
          <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                  aria-controls="navbarNav"
                  aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav">
              <li className="nav-item active">
                <a className="nav-link" href="/">Home <span className="sr-only">(current)</span></a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="/login">Login</a>
              </li>
            </ul>
          </div>
        </nav>
        <div className="container-fluid">
          <div className="card bg-dark text-white header">
            <img src={image1} className="card-img" alt="synth"/>
              <div className="card-img-overlay">
                <h1 className="card-title text-monospace">Synthesizrs</h1>
                <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
                  incididunt ut
                  labore et dolore magna aliqua. </p>
              </div>
          </div>
          <div className="card-group">
            <div className="card">
              <img src={image2} className="card-img-top" alt="..."/>
                <div className="card-body">
                  <h5 className="card-title">Non diam</h5>
                  <p className="card-text">Dictum varius duis at consectetur lorem donec massa sapien faucibus. </p>
                  <p className="card-text"><small className="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
            <div className="card">
              <img src={image3} className="card-img-top" alt="..."/>
                <div className="card-body">
                  <h5 className="card-title">Condimentum vitae sapien</h5>
                  <p className="card-text">Nulla pellentesque dignissim enim sit amet. Ut porttitor leo a diam
                    sollicitudin. </p>
                  <p className="card-text"><small className="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
            <div className="card">
              <img src={image4} className="card-img-top" alt="..."/>
                <div className="card-body">
                  <h5 className="card-title">Mattis ullamcorper</h5>
                  <p className="card-text">Habitasse platea dictumst vestibulum rhoncus est pellentesque. Semper eget duis at
                    tellus.
                    Condimentum vitae sapien pellentesque habitant morbi tristique senectus.</p>
                  <p className="card-text"><small className="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
          </div>
        </div>
      </div>)
}

export default App;
