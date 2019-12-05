function checkSize() {
  if ($(window).width() > $(window).height()) {
    $('#menu-btn').hide()
    if (!($(".page-wrapper").hasClass('toggled'))) {
      $(".page-wrapper").toggleClass('toggled')
    }
  }

  if ($(window).width() < $(window).height()) {
    $('#menu-btn').show();
  }
}

jQuery(async $ => {

  $(document).ready(() => {
    checkSize();
  });

  $(window).resize(() => {
    checkSize();
  });

  $('#toggle-detalhes').click(() => {
    setTimeout($('#dashboard-frame').change(), 50);
    $('#dashboard-frame').attr('src', "");
    $('#dashboard-frame').attr('src', 'detalhes.html');

    $('#breadcrumb-item-add').html(`
      <li class="breadcrumb-item"><a href="#">Home</a></li>
      <li class="breadcrumb-item"><a href="#">Meu Computador</a></li>
      <li class="breadcrumb-item active" aria-current="page">Detalhes</li>
    `);
    $('#dashboard-frame').change()
  });

  $('#toggle-cpu').click(() => {
    setTimeout($('#dashboard-frame').change(), 50);
    $('#dashboard-frame').attr('src', "");
    $('#dashboard-frame').attr('src', 'cpu.html');

    $('#breadcrumb-item-add').html(`
      <li class="breadcrumb-item"><a href="#">Home</a></li>
      <li class="breadcrumb-item"><a href="#">Meu Computador</a></li>
      <li class="breadcrumb-item active" aria-current="page">Processador</li>
    `);
    $('#dashboard-frame').change()
  });

  $('#toggle-gpu').click(() => {
    setTimeout($('#dashboard-frame').change(), 50);
    $('#dashboard-frame').attr('src', "");
    $('#dashboard-frame').attr('src', 'gpu.html');

    $('#breadcrumb-item-add').html(`
      <li class="breadcrumb-item"><a href="#">Home</a></li>
      <li class="breadcrumb-item"><a href="#">Meu Computador</a></li>
      <li class="breadcrumb-item active" aria-current="page">Placa de Vídeo</li>
    `);
    $('#dashboard-frame').change()
  });

  $('#toggle-ram').click(() => {
    setTimeout($('#dashboard-frame').change(), 50);
    $('#dashboard-frame').attr('src', "");
    $('#dashboard-frame').attr('src', 'ram.html');

    $('#breadcrumb-item-add').html(`
      <li class="breadcrumb-item"><a href="#">Home</a></li>
      <li class="breadcrumb-item"><a href="#">Meu Computador</a></li>
      <li class="breadcrumb-item active" aria-current="page">Memória RAM</li>
    `);
    $('#dashboard-frame').change()
  });

  $('#toggle-disco').click(() => {
    setTimeout($('#dashboard-frame').change(), 50);
    $('#dashboard-frame').attr('src', "");
    $('#dashboard-frame').attr('src', 'armazenamento.html');

    $('#breadcrumb-item-add').html(`
      <li class="breadcrumb-item"><a href="#">Home</a></li>
      <li class="breadcrumb-item"><a href="#">Meu Computador</a></li>
      <li class="breadcrumb-item active" aria-current="page">Armazenamento</li>
    `);
    $('#dashboard-frame').change()
  });

  $('#dashboard-frame').change(() => {
    let element = document.getElementById('dashboard-frame');
    element.style.height = element.contentWindow.document.body.scrollHeight + 'px';
  });



  $("#sidebar").hover(
      function () {
          console.log("mouseenter");
          $(".page-wrapper").addClass("sidebar-hovered");
      },
      function () {
          console.log("mouseout");
          $(".page-wrapper").removeClass("sidebar-hovered");
      }
  )

    // Dropdown menu
    $(".sidebar-dropdown > a").click(function () {
        $(".sidebar-submenu").slideUp(200);
        if ($(this).parent().hasClass("active")) {
            $(".sidebar-dropdown").removeClass("active");
            $(this).parent().removeClass("active");
        } else {
            $(".sidebar-dropdown").removeClass("active");
            $(this).next(".sidebar-submenu").slideDown(200);
            $(this).parent().addClass("active");
        }

    });

    //toggle sidebar
    $("#toggle-sidebar").click(function () {
        $(".page-wrapper").toggleClass("toggled");
    });
    //Pin sidebar
    $("#pin-sidebar").click(function () {
        if ($(".page-wrapper").hasClass("pinned")) {
            // unpin sidebar when hovered
            $(".page-wrapper").removeClass("pinned");
            $("#sidebar").unbind( "hover");
        } else {
            $(".page-wrapper").addClass("pinned");
            $("#sidebar").hover(
                function () {
                    console.log("mouseenter");
                    $(".page-wrapper").addClass("sidebar-hovered");
                },
                function () {
                    console.log("mouseout");
                    $(".page-wrapper").removeClass("sidebar-hovered");
                }
            )

        }
    });


    //toggle sidebar overlay
    $("#overlay").click(function () {
        $(".page-wrapper").toggleClass("toggled");
    });

    //switch between themes
    var themes = "default-theme legacy-theme chiller-theme ice-theme cool-theme light-theme";
    $('[data-theme]').click(function () {
        $('[data-theme]').removeClass("selected");
        $(this).addClass("selected");
        $('.page-wrapper').removeClass(themes);
        $('.page-wrapper').addClass($(this).attr('data-theme'));
    });

    // switch between background images
    var bgs = "bg1 bg2 bg3 bg4";
    $('[data-bg]').click(function () {
        $('[data-bg]').removeClass("selected");
        $(this).addClass("selected");
        $('.page-wrapper').removeClass(bgs);
        $('.page-wrapper').addClass($(this).attr('data-bg'));
    });

    // toggle background image
    $("#toggle-bg").change(function (e) {
        e.preventDefault();
        $('.page-wrapper').toggleClass("sidebar-bg");
    });

    // toggle border radius
    $("#toggle-border-radius").change(function (e) {
        e.preventDefault();
        $('.page-wrapper').toggleClass("boder-radius-on");
    });

    //custom scroll bar is only used on desktop
    if (!/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) {
        $(".sidebar-content").mCustomScrollbar({
            axis: "y",
            autoHideScrollbar: true,
            scrollInertia: 300
        });
        $(".sidebar-content").addClass("desktop");

    }
});
