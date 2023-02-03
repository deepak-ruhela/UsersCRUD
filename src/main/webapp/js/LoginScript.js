$(function() {

	if (localStorage.chkbx && localStorage.chkbx != '') {
		$('#remember_me').attr('checked', 'checked');
		$('#username').val(localStorage.username);
		$('#pass').val(localStorage.pass);
	} else {
		$('#remember_me').removeAttr('checked');
		$('#username').val('');
		$('#pass').val('');
	}
	$('#remember_me').click(function() {
		if ($('#remember_me').is(':checked')) {
			// save username and password
			localStorage.username = $('#username').val();
			localStorage.pass = $('#pass').val();
			localStorage.chkbx = $('#remember_me').val();
		} else {
			localStorage.username = '';
			localStorage.pass = '';
			localStorage.chkbx = '';
		}
	});
});