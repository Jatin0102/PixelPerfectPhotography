document.addEventListener("DOMContentLoaded", function () {

    const bookingForm = document.querySelector("form");

    if (bookingForm) {

        bookingForm.addEventListener("submit", function (e) {

            const date = document.querySelector("input[type='date']").value;

            if (date === "") {

                alert("Please select Event Date");

                e.preventDefault();

            }

        });

    }

});