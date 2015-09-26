appModule.controller('galleryController', function ($scope, Lightbox) {
	
	$scope.images = [ {
		'url' : 'http://localhost:8080/PhotoGallery/images/images-1.jpg',
		'thumbUrl' : 'http://localhost:8080/PhotoGallery/images/images-1.jpg',
	}, {
		'url' : 'http://localhost:8080/PhotoGallery/images/images-2.jpg',
		'thumbUrl' : 'http://localhost:8080/PhotoGallery/images/images-2.jpg',
	} ];

	$scope.openLightboxModal = function(index) {
		Lightbox.openModal($scope.images, index);
	};
});