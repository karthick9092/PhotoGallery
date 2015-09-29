appModule.controller('galleryController', function ($scope, Lightbox) {
	
	$scope.images = [ {
		'url' : 'images/marriage/img1.jpg',
		'thumbUrl' : 'images/marriage/img1.jpg',
	}, {
		'url' : 'images/marriage/img2.jpg',
		'thumbUrl' : 'images/marriage/img2.jpg',
	}, {
		'url' : 'images/marriage/img3.jpg',
		'thumbUrl' : 'images/marriage/img3.jpg',
	}, {
		'url' : 'images/marriage/img4.jpg',
		'thumbUrl' : 'images/marriage/img4.jpg',
	}, {
		'url' : 'images/marriage/img5.jpg',
		'thumbUrl' : 'images/marriage/img5.jpg',
	}, {
		'url' : 'images/marriage/img6.jpg',
		'thumbUrl' : 'images/marriage/img6.jpg',
	}, {
		'url' : 'images/marriage/img7.jpg',
		'thumbUrl' : 'images/marriage/img7.jpg',
	}, {
		'url' : 'images/marriage/img8.jpg',
		'thumbUrl' : 'images/marriage/img8.jpg',
	}, {
		'url' : 'images/marriage/img9.jpg',
		'thumbUrl' : 'images/marriage/img9.jpg',
	}];

	$scope.openLightboxModal = function(index) {
		Lightbox.openModal($scope.images, index);
	};
});
