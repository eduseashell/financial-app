"use strict";
angular.module('financial.master.controller', []);
angular.module('financial.master.controller').

controller('FooterCtrl', ['$scope', function ($scope) {
	$scope.footerMenu = ['©2015 Kwon', 'Financial App', 'Copyright notice', 'Contact us', 'About us'];
}]).

controller('MenuBarCtrl', ['$scope', function ($scope) {
	$scope.menu = "1";
	$scope.divider = "2";
	$scope.menuBar = [{
		"menuBar" : "Finance",
		"menuItems" : [{
			"menuType" : $scope.menu, "menuName" : "Simple and Compound", "menuAction" : "#" },{
			"menuType" : $scope.menu, "menuName" : "Annuity", "menuAction" : "#" },{
			"menuType" : $scope.menu, "menuName" : "perpetuity", "menuAction" : "#" },{
			"menuType" : $scope.divider, "menuName" : "NO", "menuAction" : "#" },{
			"menuType" : $scope.menu, "menuName" : "Other", "menuAction" : "#" },{
			"menuType" : $scope.divider, "menuName" : "", "menuAction" : "#" },{
			"menuType" : $scope.menu, "menuName" : "Formula", "menuAction" : "#"
		}]
	}];
}]);