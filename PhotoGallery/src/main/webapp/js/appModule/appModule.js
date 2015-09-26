var appModule = angular.module('photogallery', ['ngRoute', 'route-segment', 'view-segment', 'ui.bootstrap', 'bootstrapLightbox']);

appModule.config(function ($routeSegmentProvider) {	
	$routeSegmentProvider.
	when('/gallery', 'gallery').
	when('/sample', 'sample').
	segment('gallery', { templateUrl: 'pages/gallery.html', controller: 'galleryController' }).
	segment('sample', { templateUrl: 'pages/sample.html', controller: 'homeController' })
});





