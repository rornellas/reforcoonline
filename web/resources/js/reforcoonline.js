function doAjaxPost(action, form) {

	$.ajax({
		method : "POST",
		url : action,
		data : $(form).serialize(),
		success : function(response) {
			$("#message").html($(response).find("#message").html());
		},
		error : function(e) {

			alert('Erro: ' + e);

		}
	});

}

/**
 * Reset function
 */
jQuery.fn.reset = function() {

	this.each(function() {

		if ($(this).is('form')) {

			var button = jQuery(jQuery('<input type="reset" />'));

			button.hide();

			$(this).append(button);

			button.click().remove();

		} else if ($(this).parent('form').size()) {

			var button = jQuery(jQuery('<input type="reset" />'));

			button.hide();

			$(this).parent('form').append(button);

			button.click().remove();

		} else if ($(this).find('form').size()) {

			$(this).find('form').each(function() {

				var button = jQuery(jQuery('<input type="reset" />'));

				button.hide();

				$(this).append(button);

				button.click().remove();

			});

		}

	});

	return this;

};
