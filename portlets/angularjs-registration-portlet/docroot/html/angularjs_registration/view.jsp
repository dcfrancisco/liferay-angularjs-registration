<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.17/angular.min.js"></script>
<div class="<portlet:namespace/>container">
      <section id="section1" ng-controller="sectionController">
      <form class="form-register" role="form">
        <h2 class="form-register-heading">Please Register</h2>
        <input type="text" class="form-control" placeholder="Full Name" data-bv-field="fullName" required autofocus>
        <input type="text" class="form-control" placeholder="Company" data-bv-field="company" required>
        <button class="btn btn-lg btn-success btn-block continue" type="submit" ng-click="myData.doClick(item, $event)">Continue <span class="glyphicon glyphicon-chevron-right"></span></button>
      </form>
        </section>
        <section id="section2">
      <form class="form-register" role="form">
        <h2 class="form-register-heading">Step 2</h2>
        <button class="btn btn-lg btn-success btn-block back" type="button"><span class="glyphicon glyphicon-chevron-left"></span> Back</button>
        <input type="text" class="form-control" placeholder="Position" required>
        <input type="email" class="form-control" placeholder="Email address" required >
         <button class="btn btn-lg btn-success btn-block continue" type="submit">Continue <span class="glyphicon glyphicon-chevron-right"></span></button>
      </form>
        </section>
        <section id="section3">
      <form class="form-register" role="form">
        <h2 class="form-register-heading">Step 3</h2>
        <button class="btn btn-lg btn-success btn-block back" type="button"><span class="glyphicon glyphicon-chevron-left"></span> Back</button>
        <input type="password" class="form-control" placeholder="Password" required>
        <input type="password" class="form-control" placeholder="Repeate Password" required>
         <button class="btn btn-lg btn-success btn-block continue" type="submit">Continue <span class="glyphicon glyphicon-chevron-right"></span></button>
      </form>
        </section>
        <section id="section4">
      <form class="form-register" role="form">
        <h2 class="form-register-heading">Step 4</h2>
        <button class="btn btn-lg btn-success btn-block back" type="button"><span class="glyphicon glyphicon-chevron-left"></span> Back</button>
        <select class="form-control" placeholder="Age">
          <option value="18">18</option>
          <option value="19">19</option>
          <option value="20">20</option>
          <option value="21">21</option>
        </select>
        <select class="form-control" placeholder="State">
          <option value="18">California</option>
          <option value="19">New York</option>
          <option value="20">Miami</option>
          <option value="21">Oregon</option>
        </select>
         <button class="btn btn-lg btn-success btn-block continue" type="submit">Continue <span class="glyphicon glyphicon-chevron-right"></span></button>
               </form>
         </section>
        <section id="completed">
        <h2 class="form-register-heading">Completed!!</h2>
        </section>
        <div id="stepsContainer">
            <div class="stepGrid">
              <span class="step step1 stepNotDone">1</span>
          </div>
          <div class="stepGrid">
              <span class="step step2 stepNotDone">2</span>
          </div>
          <div class="stepGrid">
              <span class="step step3 stepNotDone">3</span>
          </div>
          <div class="stepGrid">
              <span class="step step4 stepNotDone">4</span>
          </div>
        </div>
        <div class="progress progress-striped">
          <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 0%">
        </div>
</div> <!-- /container -->
<script>
    var ngContainer = document.getElementById("<portlet:namespace/>container");
    angular.bootstrap(ngContainer, ["<portlet:namespace/>container"]);
</script>