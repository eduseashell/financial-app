"use strict";

angular.module('financial.finance.simpleandcompound', [
	'financial.finance.simpleandcompound.controller'
]);
angular.module('financial.finance.simpleandcompound').

config(['$routeProvider', function ($routeProvider) {
	$routeProvider.
		when('/finance/simpleandcompound', {
			templateUrl: 'app/modules/finance/simplecompound/views/SimpleAndCompound.html',
			controller: 'SimpleAndCompoundCtrl'
		}).
		otherwise({
			redirectTo: '/finance/simpleandcompound'
		});
}]);