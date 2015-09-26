appModule.controller('homeController', function ($scope, $http, $rootScope) {
	
	$scope.userLoginObj;
	
	$scope.login = function () {
		$http.post("/AngularTest/login", "username=" + $scope.userLoginObj.username
				+ "&password=" + $scope.userLoginObj.password, {
			headers: {'Content-Type': 'application/x-www-form-urlencoded'}
		}).then (function (data) {
			alert("login successful");
		}, function (data) {
			alert("login failure");
		});
	}
});