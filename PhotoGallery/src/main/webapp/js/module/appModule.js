var appModule = angular.module('photogallery', ['ngRoute', 'route-segment', 'view-segment']);

appModule.config(function ($routeSegmentProvider) {	
	$routeSegmentProvider.
	when('/test', 'test').
	when('/sample', 'sample').
	segment('test', { templateUrl: 'pages/test.html', controller: 'homeController' }).
	segment('sample', { templateUrl: 'pages/sample.html', controller: 'homeController' })
});





