<!DOCTYPE html>
<!-- saved from url=(0130)https://weredi.magister.net/magister/#/elo/studiewijzer/project/9395?overzichtType=0&geselecteerdVak=Alle%20vakken&selectedId=9395 -->
<html lang="nl-nl" class="k-webkit k-webkit86 ng-scope"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style type="text/css">@charset "UTF-8";[ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide:not(.ng-hide-animate){display:none !important;}ng\:form{display:block;}.ng-animate-shim{visibility:hidden;}.ng-anchor{position:absolute;}</style>
        <title data-ng-bind-template="Studiewijzers - Magister" class="ng-binding">Studiewijzers - Magister</title>
        
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="robots" content="noindex, nofollow">
        <meta name="viewport" content="width=device-width">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-1.png" sizes="16x16">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-2.png" sizes="32x32">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-3.png" sizes="48x38">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-4.png" sizes="64x64">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-5.png" sizes="128x128">
        <link rel="icon" type="image/x-icon" href="https://weredi.magister.net/magister/assets/images/appicon-6.png" sizes="256x256">
        <script type="text/javascript" async="" defer="" src="./ConnectFour_files/ppms.js.download"></script><script async="" src="./ConnectFour_files/46fb0b98-44b5-4448-8a43-1b25d6058c53.js.download"></script><script type="text/javascript">
            if (window.document.documentMode) {
                window.location.href = '/unsupported-browser.html'
            }
        </script>
        <script src="./ConnectFour_files/oidc-client.min.js.download"></script>
        <script src="./ConnectFour_files/oidc_config.js.download"></script>
        <script src="./ConnectFour_files/settings.js.download"></script>
        <style>
            :root {
                --chrome-background: #fff;
                --primary-background: #1f97f9;
                --secondary-background: #0683ea;
                --background-1: #0099f6;
                --background-2: #fff;
                --background-3: #ccc;
                --background-4: #434343;
                --background-5: #fafafa;
                --background-6: #333;
                --background-7: #f2f2f2;
                --background-8: #ccc;
                --background-9: transparent;
                --background-10: #005c86;
                --background-11: #e1f4fd;

                --primary-text-color: #1f97f9;
                --secondary-text-color: #000;
            }

            html,
            body {
                margin: 0;
                padding: 0;
                height: 100vh;
            }

            .container {
                display: flex;
                height: 100vh;
            }

            .appbar-host {
                width: 64px;
                min-width: 64px;
                background: var(--secondary-background);
            }

            .menu-host {
                width: 240px;
                min-width: 240px;
                position: relative;
                background: var(--primary-background);
                transition: all .25s ease-out;
            }

            .menu-host .logo {
                position: absolute;
                left: 17px;
                top: 30px;
            }

            .menu-host .logo a {
                display: flex;
                height: 40px;
                align-items: center;
            }

            .menu-host .logo svg {
                fill: #fff;
                width: 32px;
                height: 32px;
                margin-right: 6px;
            }

            .menu-host .logo span {
                color: #fff;
                font: 31px 'Droid Sans', sans-serif;
                font-weight: 400;
            }

            .collapsed-menu {
                width: 64px;
                min-width: 65px;
            }

            .container>ui-view {
                flex-grow: 1;
                padding-left: 24px;
                padding-right: 24px;
                padding-bottom: 24px;
                padding-top: 80px;
                position: relative;
            }

            /* skeleton loaders */
            .appbar-host.loading::after {
                content: "";
                display: block;
                width: 240px;
                height: 100%;

                background-image:
                    linear-gradient(90deg, rgba(6, 131, 234, 0) 0, rgba(6, 131, 234, 0.8) 50%, rgba(6, 131, 234, 0) 100%),
                    
                    radial-gradient(circle 5px, rgba(255, 255, 255, 0.6) 99%, transparent 0),
                    radial-gradient(circle 5px, rgba(255, 255, 255, 0.6) 99%, transparent 0),
                    radial-gradient(circle 5px, rgba(255, 255, 255, 0.6) 99%, transparent 0),
                    radial-gradient(circle 5px, rgba(255, 119, 51, 0.6) 99%, transparent 0),

                    radial-gradient(circle 18px, rgba(31, 151, 249, 0.8) 99%, transparent 0),
                    radial-gradient(circle 18px, rgba(31, 151, 249, 0.8) 99%, transparent 0),
                    radial-gradient(circle 18px, rgba(31, 151, 249, 0.8) 99%, transparent 0),
                    radial-gradient(circle 18px, rgba(31, 151, 249, 0.8) 99%, transparent 0),
                    radial-gradient(circle 18px, rgba(31, 151, 249, 0.8) 99%, transparent 0);

                background-size:
                    34px 100%,
                    10px 10px,
                    10px 10px,
                    10px 10px,
                    10px 10px,
                    36px 36px,
                    36px 36px,
                    36px 36px,
                    36px 36px,
                    36px 36px;

                background-position:
                    -32px 0,
                    16px 34px,
                    36px 34px,
                    16px 54px,
                    36px 54px,
                    14px 84px,
                    14px calc(100% - 178px),
                    14px calc(100% - 124px),
                    14px calc(100% - 72px),
                    14px calc(100% - 20px);

                background-repeat: no-repeat;
                animation: loading-appbar 1.5s infinite;
            }

            @keyframes loading-appbar {
                to {
                    background-position:
                        96px 0,
                        16px 34px,
                        36px 34px,
                        16px 54px,
                        36px 54px,
                        14px 84px,
                        14px calc(100% - 178px),
                        14px calc(100% - 124px),
                        14px calc(100% - 72px),
                        14px calc(100% - 20px);
                }
            }

            .menu-host.loading::after {
                margin-top: 80px;
                content: "";
                display: block;
                width: 100%;
                height: calc(100% - 80px);

                --menu-icon: radial-gradient(circle 14px, rgba(255, 255, 255, 0.5) 99%, transparent 0);
                --menu-line: linear-gradient(rgba(255, 255, 255, 0.4) 15px, transparent 0);

                --menu-size-icon: 25px 25px;
                --menu-skeleton-size2: 124px 19px;
                --menu-skeleton-size3: 144px 19px;

                --menu-icon1-position: 18px 12px;
                --menu-icon2-position: 18px 56px;
                --menu-icon3-position: 18px 100px;
                --menu-icon4-position: 18px 142px;
                --menu-icon5-position: 18px 188px;
                --menu-icon6-position: 18px 232px;
                --menu-icon7-position: 18px 276px;
                --menu-icon8-position: 18px 320px;

                --menu-line1-position: 52px 16px;
                --menu-line2-position: 52px 60px;
                --menu-line3-position: 52px 104px;
                --menu-line4-position: 52px 146px;
                --menu-line5-position: 52px 192px;
                --menu-line6-position: 52px 236px;
                --menu-line7-position: 52px 280px;
                --menu-line8-position: 52px 324px;

                background-image:
                    linear-gradient(90deg, rgba(31, 151, 249, 0) 0, rgba(31, 151, 249, 0.8) 50%, rgba(31, 151, 249, 0) 100%),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),
                    var(--menu-icon),

                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line),
                    var(--menu-line);

                background-size:
                    140px calc(100% - 20px),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),
                    var(--menu-size-icon),

                    var(--menu-skeleton-size3),
                    var(--menu-skeleton-size2),
                    var(--menu-skeleton-size3),
                    var(--menu-skeleton-size2),
                    var(--menu-skeleton-size3),
                    var(--menu-skeleton-size3),
                    var(--menu-skeleton-size3),
                    var(--menu-skeleton-size2),
                    var(--menu-skeleton-size2);

                background-position:
                    -440px 0,
                    var(--menu-icon1-position),
                    var(--menu-icon2-position),
                    var(--menu-icon3-position),
                    var(--menu-icon4-position),
                    var(--menu-icon5-position),
                    var(--menu-icon6-position),
                    var(--menu-icon7-position),
                    var(--menu-icon8-position),
                    18px calc(100% - 20px),

                    var(--menu-line1-position),
                    var(--menu-line2-position),
                    var(--menu-line3-position),
                    var(--menu-line4-position),
                    var(--menu-line5-position),
                    var(--menu-line6-position),
                    var(--menu-line7-position),
                    var(--menu-line8-position),
                    52px calc(100% - 20px);

                background-repeat: no-repeat;
                animation: loading-menu 1.5s infinite;
            }

            @keyframes loading-menu {
                to {
                    background-position:
                        256px 0,
                        var(--menu-icon1-position),
                        var(--menu-icon2-position),
                        var(--menu-icon3-position),
                        var(--menu-icon4-position),
                        var(--menu-icon5-position),
                        var(--menu-icon6-position),
                        var(--menu-icon7-position),
                        var(--menu-icon8-position),
                        18px calc(100% - 20px),

                        var(--menu-line1-position),
                        var(--menu-line2-position),
                        var(--menu-line3-position),
                        var(--menu-line4-position),
                        var(--menu-line5-position),
                        var(--menu-line6-position),
                        var(--menu-line7-position),
                        var(--menu-line8-position),
                        52px calc(100% - 20px);
                }
            }

            .container {
                display: flex;
                flex-direction: row;
            }
            .view {
                flex-grow: 1;
            }
        </style>
    <meta name="buildDate" content="2020-11-16T08:14:10.091Z"><meta name="release" content="true"><link href="./ConnectFour_files/styles.9dd7a9410920c3f0e0d2.css" rel="stylesheet"><link href="./ConnectFour_files/print.9dd7a9410920c3f0e0d2.css" rel="stylesheet" media="print"><script charset="utf-8" src="./ConnectFour_files/vendors_magister.a0799aa6bde3e5e22725.js.download"></script><script charset="utf-8" src="./ConnectFour_files/magister.3acc4461d1a110556d73.js.download"></script><style type="text/css">.fancybox-margin{margin-right:0px;}</style><script charset="utf-8" src="./ConnectFour_files/vandaag.803726c87cf301809dd3.js.download"></script><script charset="utf-8" src="./ConnectFour_files/studiewijzer.c0fb0c889cd5d8ea2bbe.js.download"></script></head>
    <body data-new-gr-c-s-check-loaded="14.984.0" data-gr-ext-installed="">
        <div class="container">
            <div data-sm-toast="toasts"><div class="toasts">
    <!-- ngRepeat: toast in activeToasts -->
</div>
</div>
            <div class="dialog-overlay ng-binding ng-isolate-scope ng-hide" data-ng-show="isDialogVisible" data-sm-dialog="dialog">
    <div class="dialog" data-ng-class="{&#39;dialog-large&#39;: size === 2, &#39;dialog-medium&#39;: size === 1, &#39;dialog-small&#39;: size === 0}">
        <div class="content-pane">
            <h3 class="title ng-binding" data-ng-bind="title"></h3>
            <div ng-class="{&#39;content&#39;: frameless !== true, &#39;content-frameless&#39;: frameless}" class="dialog-content content"></div>
            <footer class="footer">
                <!-- ngRepeat: button in buttonsOnScreen -->
            </footer>
        </div>
    </div>
    
</div>
            <div class="appbar-host" ng-class="{&#39;loading&#39;: $root.isLoading}">
                <mg-appbar class="ng-isolate-scope">
    <div class="appbar">
    <!-- ngIf: ctrl.showGripper -->
    <div class="spacer"></div>
    <!-- ngIf: ctrl.buttonVisibility.messages --><div class="menu-button ng-scope" ng-if="ctrl.buttonVisibility.messages" data-sm-logged-in-user="">
    <a id="menu-berichten-new" href="https://weredi.magister.net/magister/#/berichten" "="">
        <i class="ico far fa-envelope"></i>
        <!-- ngIf: unread !== 0 -->
        <span>Berichten</span>
    </a>
</div><!-- end ngIf: ctrl.buttonVisibility.messages -->
    <div class="menu-button">
        <a id="help-menu" ng-click="ctrl.toggleHelpMenu($event)">
            <i class="far fa-question-circle"></i>
            <span>Help</span>
        </a>
        <!-- ngIf: ctrl.showHelpMenu -->
    </div>
    <!-- ngIf: $root.showPersoonKiezer -->
    <div class="menu-button">
        <a id="user-menu" ng-click="ctrl.toggleShowUserMenu($event)">
            <!-- ngIf: ctrl.isStudent --><figure ng-if="ctrl.isStudent" class="ng-scope">
                <img alt="Ilse van Hooff" mg-http-src="/api/leerlingen/16902/foto" src="blob:https://weredi.magister.net/cd7b93aa-af53-4f03-89e4-441a19ccc6a5">
                <i class="far fa-user-cog"></i>
            </figure><!-- end ngIf: ctrl.isStudent -->
            <!-- ngIf: !ctrl.isStudent -->
            <span>Beheer/account</span>
        </a>
        <!-- ngIf: ctrl.showUserMenu -->
    </div>
</div>

<mg-feedback-dialog show="ctrl.showFeedback" on-close="ctrl.closeFeedbackDialog()"></mg-feedback-dialog>

    </mg-appbar>
            </div>
            <div class="menu-host" ng-class="{&#39;collapsed-menu&#39;: !$root.menuExpanded, &#39;loading&#39;: $root.isLoading}">
                <div class="logo">
                    <a href="https://weredi.magister.net/magister/#/vandaag">
                        <svg aria-hidden="true" viewBox="0 0 32 32">
                            <path d="M27.328 27.328c-3.136 3.104-6.912 4.672-11.328 4.672s-8.192-1.568-11.296-4.672-4.704-6.912-4.704-11.328c0-4.416 1.568-8.192 4.704-11.328s6.88-4.672 11.296-4.672c4.416 0 8.192 1.568 11.328 4.672s4.672 6.912 4.672 11.328c0 4.416-1.568 8.192-4.672 11.328zM26.080 5.92c-2.816-2.784-6.176-4.16-10.080-4.16s-7.264 1.376-10.048 4.16c-2.816 2.816-4.192 6.176-4.192 10.080 0 3.968 1.376 7.328 4.192 10.112 2.784 2.816 6.144 4.192 10.048 4.192s7.264-1.376 10.080-4.192c2.784-2.784 4.16-6.144 4.16-10.112 0-3.904-1.376-7.264-4.16-10.080zM22.176 15.872c1.216 0.448 2.208 0.992 2.944 1.632s1.28 1.312 1.6 2.048 0.512 1.472 0.608 2.112c0.064 0.64 0.128 1.408 0.16 2.272 0 0.256 0 0.448 0 0.576-1.376 1.472-3.040 2.368-4.992 2.688-1.952 0.288-3.68 0.128-5.184-0.448s-2.592-1.344-3.232-2.304c-1.728 0.608-3.648 0.608-5.824 0-2.176-0.64-3.392-1.312-3.616-2.080 0-0.032-0.032-0.224-0.064-0.544-0.064-0.352-0.064-0.64-0.064-0.896s0-0.576 0.032-1.024c0-0.448 0.064-0.832 0.128-1.184s0.16-0.768 0.352-1.184 0.416-0.832 0.672-1.184c0.256-0.352 0.576-0.704 1.024-1.056 0.448-0.32 0.928-0.608 1.472-0.864-1.344-0.576-2.144-1.76-2.432-3.552s-0.032-3.168 0.8-4.128c0.672-0.832 1.344-1.376 2.048-1.664 0.672-0.256 1.568-0.384 2.72-0.352 0.864 0.064 1.696 0.416 2.464 1.152 0.768 0.704 1.056 1.664 0.832 2.848 0.096-0.416-0.032-0.832-0.384-1.248-0.288-0.48-0.832-0.8-1.632-0.896-0.832-0.096-1.472 0-1.984 0.288-0.8 0.48-1.312 0.896-1.568 1.184s-0.704 0.608-1.376 0.992c-1.184 0.768-1.44 1.824-0.704 3.264 0.736 1.408 1.792 2.24 3.168 2.496-1.312-0.256-2.24-1.312-2.816-3.136-0.32-0.832-0.192-1.44 0.352-1.856 0.288-0.224 0.512-0.224 0.64 0 0.544-0.832 1.664-1.44 3.36-1.76 0.416-0.096 0.992-0.064 1.664 0.096 0.704 0.128 1.088 0.416 1.216 0.768v-0.064c0 0.128 0.032 0.352 0.032 0.64 0.032 0.288 0.032 0.512 0.032 0.672 0 0.8-0.096 1.504-0.32 2.144-0.032 1.024 0.128 1.664 0.448 1.856h0.064c-0.512 0.192-0.896 0.224-1.184 0.128-0.096 0-0.16-0.032-0.256-0.128 1.376 0.672 2.368 1.536 2.944 2.624l0.928-0.544c-1.152-0.768-1.824-2.080-1.92-3.936-0.064-1.344 0-2.336 0.16-2.944-0.064-0.096-0.096-0.288-0.096-0.576 0.096-1.504 1.056-2.368 2.784-2.624 3.104-0.48 5.024 0.352 5.824 2.56 0.416 0.832 0.448 1.952 0.128 3.328s-0.992 2.24-1.952 2.624v1.184zM8.512 16.448c0.224 0.768 0.768 1.28 1.6 1.504 0.832 0.256 1.632 0.128 2.368-0.288 0.704-0.448 1.056-1.088 0.96-1.984-0.032-0.448-0.224-0.832-0.512-1.184v1.12c-0.032 0.416-0.384 0.704-1.088 0.896-0.672 0.16-1.248 0.16-1.728 0-0.864-0.32-1.312-0.736-1.312-1.312v-0.512c-0.032 0-0.096-0.032-0.16-0.064-0.32 0.544-0.352 1.152-0.128 1.824zM9.056 13.632c0.704 0.896 1.536 1.344 2.496 1.312 0.416 0 0.864-0.192 1.312-0.576l-0.064-0.064-1.248 0.32c-0.96 0.032-1.792-0.288-2.496-0.992zM14.016 13.12l-0.128 0.256c0.224 0.544 0.448 0.8 0.608 0.8-0.256 0-0.416-0.352-0.48-1.056zM15.936 9.568c0.256 0 0.672-0.032 1.28-0.064s1.056-0.032 1.344 0c0.96 0.064 1.664 0.288 2.080 0.608 0.16 0.192 0.288 0.352 0.416 0.576 0.128 0.192 0.224 0.384 0.256 0.576 0.032 0.16 0.096 0.416 0.128 0.736s0.096 0.544 0.128 0.608v-0.032c0.288-0.416 0.352-1.056 0.192-1.888-0.16-0.8-0.544-1.312-1.12-1.568-0.64-0.256-1.664-0.448-3.136-0.544-0.16 0-0.448-0.096-0.864-0.288s-0.672-0.416-0.704-0.672c-0.256 0.256-0.416 0.608-0.512 1.056-0.064 0.48 0.096 0.768 0.512 0.896zM22.56 17.632c0.128-0.768 0-1.312-0.384-1.696v0.32c0 0.032 0 0.16 0 0.352s0 0.288 0 0.32c0 0.064 0 0.128-0.032 0.256 0 0.128-0.032 0.224-0.096 0.256-0.032 0.032-0.096 0.096-0.16 0.192-0.096 0.064-0.192 0.16-0.32 0.256-0.512 0.32-1.12 0.48-1.888 0.448-0.736 0-1.312-0.256-1.664-0.704-0.128-0.16-0.192-0.48-0.192-0.96 0.128 0.128 0.256 0.256 0.448 0.32 0.192 0.096 0.352 0.128 0.48 0.128h0.192c1.12 0 2.144-0.736 3.072-2.24v-0.064c-0.928 1.376-1.984 2.048-3.2 2.048-0.32-0.032-0.736-0.192-1.184-0.416-0.096 0.224-0.128 0.416-0.128 0.544-0.032 0.896 0.288 1.568 1.024 2.048s1.536 0.576 2.368 0.32c0.864-0.224 1.408-0.832 1.664-1.728z">
                            </path>
                        </svg>
                        <span>Magister</span>
                    </a>
                </div>
                <nav data-sm-menu="menu" class="menu ng-scope">
  <div class="menu-container">
    <ul class="main-menu">
      <!-- ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-vandaag">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-home" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Vandaag</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-agenda">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-calendar-alt" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Agenda</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-afwezigheid">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-check-circle" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Afwezigheid</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-cijfers">
          <!-- ngIf: item.icon -->
          <!-- ngIf: item.text --><div class="icon-stack ng-scope" ng-if="item.text">
            <i class="far fa-circle fa-stack-2x"></i>
            <div ng-bind="item.text" class="ng-binding">10</div>
          </div><!-- end ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Cijfers</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope ng-hide">
        <a ng-click="onSelectItem(item)" id="menu-examen">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-file-certificate" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Examen</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-leerlingvolgsysteem">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-book-user" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Leerlingvolgsysteem</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope children active expanded">
        <a ng-click="onSelectItem(item)" id="menu-elo">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-book-reader" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">ELO</span>
        </a>
        <!-- ngIf: item.children --><div ng-if="item.children" class="popup-menu ng-scope">
          <h3 ng-bind="item.title" class="ng-binding">ELO</h3>
          <ul>
            <!-- ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-bronnen" class="ng-binding">Bronnen</a>
            </li><!-- end ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope active" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-studiewijzers" class="ng-binding">Studiewijzers</a>
            </li><!-- end ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-opdrachten" class="ng-binding">Opdrachten</a>
            </li><!-- end ngRepeat: child in item.children -->
          </ul>
        </div><!-- end ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope children">
        <a ng-click="onSelectItem(item)" id="menu-portfolio">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-file-user" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Portfolio</span>
        </a>
        <!-- ngIf: item.children --><div ng-if="item.children" class="popup-menu ng-scope">
          <h3 ng-bind="item.title" class="ng-binding">Portfolio</h3>
          <ul>
            <!-- ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-profiel" class="ng-binding">Profiel</a>
            </li><!-- end ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-portfoliodocumenten" class="ng-binding">Portfoliodocumenten</a>
            </li><!-- end ngRepeat: child in item.children --><li ng-repeat="child in item.children" class="submenu ng-scope" ng-class="{&#39;active&#39;: child.isActive}" ng-attr-id="{{child.id}}">
              <a ng-bind="child.title" ng-click="onSelectItem(child)" title="" id="menu-beoordeelde producten" class="ng-binding">Beoordeelde producten</a>
            </li><!-- end ngRepeat: child in item.children -->
          </ul>
        </div><!-- end ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-activiteiten">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-calendar-star" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Activiteiten</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-leermiddelen">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-books" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Leermiddelen</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems --><li ng-repeat="item in menuitems" ng-class="{
          &#39;active&#39;: item.isActive,
          &#39;children&#39;: item.children, 
          &#39;expanded&#39;: item.expanded,
          &#39;highlight-menu&#39;: item.visibleState === 1
        }" ng-hide="item.visibleState === 2" ng-attr-id="{{item.id}}" ng-mouseover="onMouseOver($event)" ng-mouseleave="onMouseLeave()" class="ng-scope">
        <a ng-click="onSelectItem(item)" id="menu-bestellen">
          <!-- ngIf: item.icon --><i class="far ng-scope fa-shopping-cart" ng-if="item.icon" ng-class="item.icon"></i><!-- end ngIf: item.icon -->
          <!-- ngIf: item.text -->
          <span ng-bind="item.title" class="caption ng-binding">Bestellen</span>
        </a>
        <!-- ngIf: item.children -->
      </li><!-- end ngRepeat: item in menuitems -->
    </ul>
  </div>
  <span id="faux-label" style="display: none;"></span>
  <div class="faux popup-menu" style="display: none;"></div>
  <div class="menu-footer">
    <a ng-click="onToggleMenuVisibility()">
      <i class="far fa-angle-double-left"></i>
      <span>Inklappen</span>
    </a>
  </div>
</nav>
            </div>
            <!-- ngView: ng-view --><div data-ng-view="ng-view" class="view ng-scope"><div id="studiewijzer-detail-container" class="container sidecolumn ng-scope" data-ng-class="{&#39;aside-toggle&#39;: !tabState.tabContainerVisible}">
    <div class="head-bar studiewijzer-details">
        <a href="https://weredi.magister.net/magister/" data-ng-click="terug()">
            </a><h1><a href="https://weredi.magister.net/magister/" data-ng-click="terug()">
                </a><a ng-click="terug()">
                    <i class="far fa-chevron-circle-left"></i>
                </a>
                <span data-ng-bind="studiewijzer.Titel" class="ng-binding">Inf DLF .HST .V5 20_21</span>
            </h1>
        
        <div aria-haspopup="true" class="dropdown-menu">
            <a title="onderdelen">
                onderdelen
            </a>
            <ul class="foldout">
                <li><a data-ng-click="unFoldAll()">alles openvouwen</a></li>
                <li><a data-ng-click="foldAll()">alles dichtvouwen</a></li>
            </ul>
        </div>
        <!-- ngIf: showBronnen() --><div data-ng-if="showBronnen()" class="ng-scope">
            <!--project-->
            <a data-ng-click="projectFolderClick(projectFolder)">projectmap openen</a>
        </div><!-- end ngIf: showBronnen() -->
    </div>
    <section class="main">
        <div class="content-container widget-container studiewijzer-content-container" data-sm-scrollbar="scrollbar" data-horizontal-scroll="false" ng-class="{&#39;menu-is-collapsed&#39;: !$root.menuExpanded}">
            <ul>
                <!-- ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-groen">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Algemeen</b>
        <strong data-ng-show="fold" class="ng-binding">Wat heb ik af &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-groen">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Databases</b>
        <strong data-ng-show="fold" class="ng-binding">Presentatie Databases &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Informatie</b>
        <strong data-ng-show="fold" class="ng-binding">Maken oefenopgave Module C4 "Datarepresentaties" &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-up-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Java project en Programmeren</b>
        <strong data-ng-show="fold" class="ng-binding ng-hide">Cursus programmeren in Java&nbsp;Uitwerkingen Java Applicaties&nbsp;&nbsp;Om de uitwerkingen te kunnen zien moet je het .zip bestand dowloaden. unzip dit op je computer. Vervolgens klik je in NetBeans in het menu bovenaan het scherm op File -&gt; Open Project ... Een nieuw venster wordt geopend, ga hierin naar de map waar je de uitwerkingen in geplaatst hebt. Selecteer een opdracht uit om te openen (alle opdrachten hebben een koffiekopje ervoor staan). Klik vervolgens op Open Project. Het project komt nu in het Project venster te staan aan de linkerkant van het scherm. Vanuit daar kun je de bestanden openen.Uitwerkingen java GdocUitwerking van Hoofdstuk 7Video's met uitleg ter voorbereiding toets!!-&nbsp;Java Uitleg Verplaats App [53:32]-&nbsp;Java Strafwerkapp [25:37]-&nbsp;Strafwerkapplet uitleg versie 2 (basis uitleg is hetzelfde) [20:22]-&nbsp;RenteApplet [40:40]-&nbsp;Java Krantenwijk en for-lus [17:57]-&nbsp;Overwerkapp en verder [15:14]-&nbsp;Java Modules (even getallen) en Switch (Hockey) [11:12]Java Project-&nbsp;Voorbeelden Javaprojecten-&nbsp;Starten met het maken van een spel (project)! [9:07]Logboek bijhouden&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Wat hieronder staat is oud!!Cursus Java ProgrammerenAlternatief voor installatie voor macBelangrijk!- Zorg dat je iedere nieuwe applicatie uit de opgaven, in een aparte map in Google-drive opslaat. - Maak in Google docs een document aan, waarin je de antwoorden van vragen beantwoord én essentieële code kunt opslaan.Filmpjes Verdubbel- en Rente-Applet (6 delen)-&nbsp;Verdubbel-applet deel 1&nbsp;(10 min)-&nbsp;Verdubbel-applet deel 2&nbsp;(10 min)-&nbsp;Verdubbel-applet deel 3&nbsp;(2 min)-&nbsp;Rente-applet deel 4&nbsp;(10 min)-&nbsp;Rente-applet deel 5&nbsp;(10 min)-&nbsp;Rente-applet deel 6&nbsp;(Filmpjes StrafwerkApplet (3 delen)-&nbsp;Strafwerkapplet deel 1&nbsp;(10 min)-&nbsp;Strafwerkapplet deel 2&nbsp;(10 min)-&nbsp;Strafwerkapplet deel 3&nbsp;(6,5 min)Filmpjes Decimaal naar binair (conversieApp) (2 delen)-&nbsp;Decimaal naar binair deel 1&nbsp;(10 min)-&nbsp;Decimaal naar binair deel 2&nbsp;(9 min)Uitleg over de SchrikkeljaarAppletFilmpjes H5 DobbelApplet (3 delen)Filmpjes werken met een eigen methode (2 delen)Voorbeeld methode met een button (zie hieronder in de map voorbeelden)Combiopdracht H4Uitwerkingen combi-opdracht H4Filmpjes Array's:-&nbsp;Enkelvoudige array-&nbsp;Meervoudig array-&nbsp;Arraylist&nbsp; (handig indien de lengte van het array niet van te voren vastligt)Mondeling- Assessment formulier (zie link naar Word-document hieronder)- Beoordelingsformulier&nbsp;(zie link naar Word-document hieronder) &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"><p><span style="font-weight: bold"></span></p><p style="font-family: "><a href="https://docs.google.com/document/d/1ePMt9Ue3HCa2eAcGGCdV5XypWJ94k_GbMnlJCz7xf3U/edit?usp=sharing" target="_blank" style="text-decoration: underline; font-weight: bold"></a><a href="https://docs.google.com/document/d/1ePMt9Ue3HCa2eAcGGCdV5XypWJ94k_GbMnlJCz7xf3U/edit?usp=sharing" target="_blank" style="text-decoration: underline; font-weight: bold"></a></p><p><a href="https://docs.google.com/document/d/1XtSJXW15GcV5d-9HsRMzWvfGKl-xrt1yzasa5RNFaj0/edit?usp=sharing" target="_blank">Cursus programmeren in Java</a><br></p><p>&nbsp;<br></p><p><a href="https://drive.google.com/file/d/1pBlPyAdCnTbN6oUujCeGDialvE2EVQfS/view?usp=sharing" target="_blank">Uitwerkingen Java Applicaties</a>&nbsp;&nbsp;<br></p><p>Om de uitwerkingen te kunnen zien moet je het .zip bestand dowloaden. unzip dit op je computer. Vervolgens klik je in NetBeans in het menu bovenaan het scherm op File -&gt; Open Project ... Een nieuw venster wordt geopend, ga hierin naar de map waar je de uitwerkingen in geplaatst hebt. Selecteer een opdracht uit om te openen (alle opdrachten hebben een koffiekopje ervoor staan). Klik vervolgens op Open Project. Het project komt nu in het Project venster te staan aan de linkerkant van het scherm. Vanuit daar kun je de bestanden openen.<br></p><p><a href="https://docs.google.com/document/d/1wwjnUmq-hnCVrvHky3CqQlXH0p4OYrUniz6_MhJ58tY/edit?usp=sharing" target="_blank">Uitwerkingen java Gdoc</a><br></p><p><a href="https://docs.google.com/document/d/1atcrk-EqRvCTWzXiioPmXWiJKk-QibgiN_aDSZML1ao/edit?usp=sharing" target="_blank">Uitwerking van Hoofdstuk 7</a></p><p><br></p><p>Video's met uitleg ter voorbereiding toets!!</p><p><br></p><p>-&nbsp;<a href="https://web.microsoftstream.com/video/08cb4b59-f53d-4999-9d5c-49c73b9d6e3e" target="_blank">Java Uitleg Verplaats App [53:32]</a></p><p>-&nbsp;<a href="https://web.microsoftstream.com/video/834dc565-8e8a-49ca-8f46-52fc17db660a" target="_blank">Java Strafwerkapp [25:37]</a><br></p><p>-&nbsp;<a href="https://web.microsoftstream.com/video/c5af76c4-e0e6-4419-b50d-ea1e31751ea5" target="_blank">Strafwerkapplet uitleg versie 2 (basis uitleg is hetzelfde) </a>[20:22]</p><p>-&nbsp;<a href="https://web.microsoftstream.com/video/9f44d664-6356-4898-a9b9-d57730501bd9" target="_blank">RenteApplet [40:40]</a></p><p>-&nbsp;<a href="https://web.microsoftstream.com/video/4e6ce9d8-0916-45d4-8851-befaf7fac927" target="_blank">Java Krantenwijk en for-lus [17:57]</a><br>-&nbsp;<a href="https://web.microsoftstream.com/video/69ae152e-d718-4eae-a28b-834c05b762ea" target="_blank">Overwerkapp en verder [15:14]</a><br>-&nbsp;<a href="https://web.microsoftstream.com/video/a08111f0-3b10-4f20-92c7-c05685ba2c99" target="_blank">Java Modules (even getallen) en Switch (Hockey) [11:12]</a></p><p><br><br></p><p><br></p><p><b><font>Java Project</font></b></p><p><font>-&nbsp;<a href="https://web.microsoftstream.com/video/96a2559f-b8e1-47c3-a516-14bf7fdb477c" target="_blank">Voorbeelden Javaprojecten</a><br>-&nbsp;<a href="https://web.microsoftstream.com/video/205ef05b-3bdd-48e8-8d2a-78146b56c723" target="_blank">Starten met het maken van een spel (project)! [9:07]</a><br><br></font></p><p><font><a href="https://docs.google.com/document/d/1IugjyhT4VwhpEdaaCmjqXZE7YB_ljsUBlSe8QWWSFeE/edit?usp=sharing" target="_blank">Logboek bijhouden</a></font></p><p><br></p><p><br></p><p><br></p><p><br></p><p><br></p><p><br></p><p><font color="#ff0000"><span class="rangySelectionBoundary"></span><b>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Wat hieronder staat is oud!!</b><span class="rangySelectionBoundary"></span></font></p><p><a href="http://java.flikthet.nl/" target="_blank">Cursus Java Programmeren</a></p><p><a href="https://maken.wikiwijs.nl/88302#!page-2559949" target="_blank">Alternatief voor installatie voor mac</a></p><ul></ul><p><br></p><p><br></p><p><strong>Belangrijk!</strong><br></p><p><strong>- Zorg dat je iedere nieuwe applicatie uit de opgaven, in een aparte map in Google-drive opslaat. - Maak in Google docs een document aan, waarin je de antwoorden van vragen beantwoord én essentieële code kunt opslaan.</strong></p><p><br></p><p><br></p><p><br></p><ul><li><p>Filmpjes Verdubbel- en Rente-Applet (6 delen)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=4tXLw0la8Rg" target="_blank">Verdubbel-applet deel 1</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=dp8mOd2zI6Q&amp;t=10s" target="_blank">Verdubbel-applet deel 2</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=CEwiwE8WyZk&amp;t=11s" target="_blank">Verdubbel-applet deel 3</a>&nbsp;(2 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=pDhdz-92F1c&amp;t=292s" target="_blank">Rente-applet deel 4</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=Yh3G3ycg5MY" target="_blank">Rente-applet deel 5</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=WAkrbZHkSHs" target="_blank">Rente-applet deel 6</a>&nbsp;(&lt;1min)<br><br></p></li><li><p>Filmpjes StrafwerkApplet (3 delen)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=eJMnyiSlvgc" target="_blank">Strafwerkapplet deel 1</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=cobaQbBBx6s" target="_blank">Strafwerkapplet deel 2</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=WiZ3RaGKQ0U" target="_blank">Strafwerkapplet deel 3</a>&nbsp;(6,5 min)<br><br></p></li><li><p>Filmpjes Decimaal naar binair (conversieApp) (2 delen)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=ruU3BwD_Bns" target="_blank">Decimaal naar binair deel 1</a>&nbsp;(10 min)<br>-&nbsp;<a href="https://www.youtube.com/watch?v=07mrrutxBpg&amp;t=27s" target="_blank">Decimaal naar binair deel 2</a>&nbsp;(9 min)</p></li></ul><p><br></p><ul><li><p><a href="https://docs.google.com/document/d/1qYT04z2iaAyh4lF1tR4yEnQZx9NMDQ8KWttEXqUd17Q/edit?usp=sharing" target="_blank">Uitleg over de SchrikkeljaarApplet<br></a><br></p></li><li><p><a href="https://www.youtube.com/watch?v=Mffa2gvUzLs" target="_blank">Filmpjes H5 DobbelApplet (3 delen)</a><br><br></p></li><li><p><a href="https://www.youtube.com/watch?v=Ko-kgOcdSHA" target="_blank">Filmpjes werken met een eigen methode (2 delen)</a><br>Voorbeeld methode met een button (zie hieronder in de map voorbeelden)</p></li></ul><p><br></p><p><br></p><ul><li><p><a href="https://docs.google.com/document/d/1b-Xs3f9H8_sxsDsM4fztedM_RhvjRhTJjaVcC1KyeFI/edit?usp=sharing" target="_blank">Combiopdracht H4</a><br><br></p></li><li><p><a href="https://docs.google.com/document/d/1uzs8qv4CRcOEOHS24yS_WW_WU_t7bGqQc3uRls3gico/edit?usp=sharing" target="_blank">Uitwerkingen combi-opdracht H4</a><br><br><br></p></li><li><p>Filmpjes Array's:<br>-&nbsp;<a href="https://www.youtube.com/watch?v=_NfwcH5zKpA" target="_blank">Enkelvoudige array</a><br>-&nbsp;<a href="https://www.youtube.com/watch?v=eNPX2pTiaHI" target="_blank">Meervoudig array</a><br>-&nbsp;<a href="https://www.youtube.com/watch?v=IEqvmsqjpT0&amp;t=302s" target="_blank">Arraylist</a>&nbsp; (handig indien de lengte van het array niet van te voren vastligt)</p></li></ul><p><br></p><p><b>Mondeling</b></p><p>- Assessment formulier (zie link naar Word-document hieronder)</p><p>- Beoordelingsformulier&nbsp;(zie link naar Word-document hieronder)</p><p><br></p><p></p></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 --><ul data-ng-if="localBronnen &amp;&amp; localBronnen.length &gt; 0" class="sources ng-scope">
            <!-- ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182824" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="11 Visueel programmeren antwoorden.doc" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-document"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">11 Visueel programmeren antwoorden.doc</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182829" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="Cursus programmeren antwoorden.doc" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-document"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">Cursus programmeren antwoorden.doc</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap --><div ng-if="bijlage.ModuleSoort === moduleSoortMap" class="ng-scope">

                    <span class="mg-icon icon-map-closed" ng-class="{&#39;icon-map-closed&#39;: bijlage.Collapsed, &#39;icon-map-open&#39;: !bijlage.Collapsed}"></span>
                    <a data-ng-bind="bijlage.Naam" ng-click="bijlage.Collapsed = !bijlage.Collapsed" class="ng-binding">Voorbeelden</a>

                    <!-- ngIf: bijlage.Bijlagen && bijlage.Bijlagen.length && bijlage.Bijlagen.length > 0 --><ul ng-hide="bijlage.Collapsed" ng-if="bijlage.Bijlagen &amp;&amp; bijlage.Bijlagen.length &amp;&amp; bijlage.Bijlagen.length &gt; 0" class="ng-scope ng-hide">
                        <!-- ngRepeat: mapBijlage in bijlage.Bijlagen --><li ng-repeat="mapBijlage in bijlage.Bijlagen" class="ng-scope">
                            <a class="right ng-hide" data-ng-show="mapBijlage.UriThumbnailSmall">
                                <figure>
                                    <!-- ngIf: mapBijlage.UriThumbnailSmall !== undefined --><img ng-if="mapBijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182832" data-show-preview="mapBijlage.MediaType === 2 &amp;&amp; mapBijlage.UriThumbnailSmall" data-preview-title="Afbeelding toevoegen in voorbeeld ImageApp.zip" class="ng-scope" style="display: none;"><!-- end ngIf: mapBijlage.UriThumbnailSmall !== undefined -->

                                    <!-- ngIf: mapBijlage.UriThumbnailSmall === undefined -->
                                </figure>
                            </a>

                            <span class="icon-unknown"></span>

                            <!-- bron, niet audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(mapBijlage)" data-ng-if="mapBijlage.ModuleSoort === 1 &amp;&amp; !mapBijlage.IsAudioOrVideo" data-ng-bind="mapBijlage.Naam" class="ng-binding ng-scope">Afbeelding toevoegen in voorbeeld ImageApp.zip</a><!-- end ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo -->

                            <!-- bron, wel audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && mapBijlage.IsAudioOrVideo -->

                            <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 2 -->
                        </li><!-- end ngRepeat: mapBijlage in bijlage.Bijlagen --><li ng-repeat="mapBijlage in bijlage.Bijlagen" class="ng-scope">
                            <a class="right ng-hide" data-ng-show="mapBijlage.UriThumbnailSmall">
                                <figure>
                                    <!-- ngIf: mapBijlage.UriThumbnailSmall !== undefined --><img ng-if="mapBijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182835" data-show-preview="mapBijlage.MediaType === 2 &amp;&amp; mapBijlage.UriThumbnailSmall" data-preview-title="Button_in_method.zip" class="ng-scope" style="display: none;"><!-- end ngIf: mapBijlage.UriThumbnailSmall !== undefined -->

                                    <!-- ngIf: mapBijlage.UriThumbnailSmall === undefined -->
                                </figure>
                            </a>

                            <span class="icon-unknown"></span>

                            <!-- bron, niet audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(mapBijlage)" data-ng-if="mapBijlage.ModuleSoort === 1 &amp;&amp; !mapBijlage.IsAudioOrVideo" data-ng-bind="mapBijlage.Naam" class="ng-binding ng-scope">Button_in_method.zip</a><!-- end ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo -->

                            <!-- bron, wel audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && mapBijlage.IsAudioOrVideo -->

                            <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 2 -->
                        </li><!-- end ngRepeat: mapBijlage in bijlage.Bijlagen --><li ng-repeat="mapBijlage in bijlage.Bijlagen" class="ng-scope">
                            <a class="right ng-hide" data-ng-show="mapBijlage.UriThumbnailSmall">
                                <figure>
                                    <!-- ngIf: mapBijlage.UriThumbnailSmall !== undefined --><img ng-if="mapBijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182837" data-show-preview="mapBijlage.MediaType === 2 &amp;&amp; mapBijlage.UriThumbnailSmall" data-preview-title="Meerdere vensters.zip" class="ng-scope" style="display: none;"><!-- end ngIf: mapBijlage.UriThumbnailSmall !== undefined -->

                                    <!-- ngIf: mapBijlage.UriThumbnailSmall === undefined -->
                                </figure>
                            </a>

                            <span class="icon-unknown"></span>

                            <!-- bron, niet audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(mapBijlage)" data-ng-if="mapBijlage.ModuleSoort === 1 &amp;&amp; !mapBijlage.IsAudioOrVideo" data-ng-bind="mapBijlage.Naam" class="ng-binding ng-scope">Meerdere vensters.zip</a><!-- end ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo -->

                            <!-- bron, wel audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && mapBijlage.IsAudioOrVideo -->

                            <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 2 -->
                        </li><!-- end ngRepeat: mapBijlage in bijlage.Bijlagen --><li ng-repeat="mapBijlage in bijlage.Bijlagen" class="ng-scope">
                            <a class="right ng-hide" data-ng-show="mapBijlage.UriThumbnailSmall">
                                <figure>
                                    <!-- ngIf: mapBijlage.UriThumbnailSmall !== undefined --><img ng-if="mapBijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182839" data-show-preview="mapBijlage.MediaType === 2 &amp;&amp; mapBijlage.UriThumbnailSmall" data-preview-title="Tekst toevoegen vanuit een bestand.zip" class="ng-scope" style="display: none;"><!-- end ngIf: mapBijlage.UriThumbnailSmall !== undefined -->

                                    <!-- ngIf: mapBijlage.UriThumbnailSmall === undefined -->
                                </figure>
                            </a>

                            <span class="icon-unknown"></span>

                            <!-- bron, niet audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(mapBijlage)" data-ng-if="mapBijlage.ModuleSoort === 1 &amp;&amp; !mapBijlage.IsAudioOrVideo" data-ng-bind="mapBijlage.Naam" class="ng-binding ng-scope">Tekst toevoegen vanuit een bestand.zip</a><!-- end ngIf: mapBijlage.ModuleSoort === 1 && !mapBijlage.IsAudioOrVideo -->

                            <!-- bron, wel audio/video -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 1 && mapBijlage.IsAudioOrVideo -->

                            <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                            <!-- ngIf: mapBijlage.ModuleSoort === 2 -->
                        </li><!-- end ngRepeat: mapBijlage in bijlage.Bijlagen -->
                    </ul><!-- end ngIf: bijlage.Bijlagen && bijlage.Bijlagen.length && bijlage.Bijlagen.length > 0 -->
                </div><!-- end ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182843" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="Assessmentformulier Java_mondeling_havo.doc" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-document"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">Assessmentformulier Java_mondeling_havo.doc</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/38717/bijlagen/182841" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="Beoordelingstformulier Project Java_havo.doc" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-document"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">Beoordelingstformulier Project Java_havo.doc</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen -->
        </ul><!-- end ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Vrije projecten</b>
        <strong data-ng-show="fold" class="ng-binding">In semester 2 en 3 kan er gewerkt worden aan twee vrije opdrachten:- BBC micro bit- Raspberry Pi- Arduino- The Internet Of Things (IoT), hier ligt een cursus voor klaar die getest moet worden!- Lego Mindstorm met nieuwe EV3&nbsp;- Website maken met HTML, CSS en bootsrap voor een externe opdrachtgever- Website maken met Wordpress voor een externe opdrachtgever (Kan, maar wel krap in tijd)- Programmeren met java in Netbeans- Javascript....- PHP....- Games met Unity- Iets met hardware?- Oude computer (- (voor bezitters van een Apple) Windows omgeving maken voor een Apple op een USB Van een oude laptop een Chromebook maken- ........Projectopdracht:&nbsp; "vrije keuze project" &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Excelbestanden met het gezicht van Donald Trump</b>
        <strong data-ng-show="fold" class="ng-binding">Je kunt dit ook zelf laten genereren via&nbsp;https://www.think-maths.co.uk/spreadsheet. &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope fold" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-down-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Algoritmiek</b>
        <strong data-ng-show="fold" class="ng-binding">Voorlopig alleen voor Nick :) &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items --><li class="studiewijzer-onderdeel ng-scope" data-ng-repeat="item in studiewijzer.Onderdelen.Items">
                    <div class="block ng-scope" data-ng-class="{&#39;fold&#39;: fold, &#39;inleiding-onderdeel&#39;:item.Titel == &#39;Inleiding&#39;}" data-studiewijzer-onderdeel-directive="onderdeel">
    <h3 class="background-blauw">
        <span class="color-label"></span>
        <span data-ng-class="{&#39;icon-up-arrow&#39;: fold != true, &#39;icon-down-arrow&#39;: fold}" data-ng-click="blockFold(item.Id)" class="icon-up-arrow"></span>
        <!-- ngIf: showBronnen() -->
        <b data-ng-click="blockFold(item.Id)" class="ng-binding">Tips en voorbeeldbestanden GUI ontwerpen in Java</b>
        <strong data-ng-show="fold" class="ng-binding ng-hide">Als je de GUI zelf wil ontwerpen (meer controle dus!), gebruik de tips in het pdf-bestand. &nbsp;</strong>
    </h3>
    <div class="content content-auto coloring-blauw">
        <div class="clearfix user-content">
            <!-- ngIf: item.TotEnMet != undefined -->
            <div data-ng-bind-html="html(htmlInhoud)" class="ng-binding"><p>Als je de GUI zelf wil ontwerpen (meer controle dus!), gebruik de tips in het pdf-bestand.</p><p><br></p><p>De huidige code van het vier-op-een-rij spel staat er ook bij, als je dat wil bekijken in NetBeans zet je alle bestanden (behalve het pdf)-bestand in de map Documents/NetBeansProjects/ConnectFour/src/connectfour op jouw computer en open je NetBeans. Als het goed is verschijnt het dan links in de verkenner in NetBeans.&nbsp;</p><p><br></p><p>Je kunt het natuurlijk ook gewoon openen in kladblok/Atom/Notepad++ en kijken wat er staat..</p></div>
        </div>
        <!-- ngIf: localBronnen && localBronnen.length > 0 --><ul data-ng-if="localBronnen &amp;&amp; localBronnen.length &gt; 0" class="sources ng-scope">
            <!-- ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189026" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="Beginnen met een GUI in Java (zonder designscherm).pdf" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-document"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">Beginnen met een GUI in Java (zonder designscherm).pdf</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189031" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="Cell.java" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-unknown"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">Cell.java</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right ng-hide" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189028" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="ConnectFour.java" class="ng-scope" style="display: none;"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-unknown"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo --><a data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; !bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">ConnectFour.java</a><!-- end ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189027?fileType=thumbnailSmall" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189027" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="emptycell.png" class="ng-scope" src="./ConnectFour_files/emptycell.png"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-picture"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo --><a data-ng-click="bijlageClick(bijlage)" data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">emptycell.png</a><!-- end ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189030?fileType=thumbnailSmall" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189030" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="redcell.png" class="ng-scope" src="./ConnectFour_files/redcell.png"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-picture"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo --><a data-ng-click="bijlageClick(bijlage)" data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">redcell.png</a><!-- end ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen --><li data-ng-repeat="bijlage in localBronnen" class="ng-scope">
                <!-- ngIf: bijlage.ModuleSoort === moduleSoortMap -->

                <!-- ngIf: bijlage.ModuleSoort !== moduleSoortMap --><div ng-if="bijlage.ModuleSoort !== moduleSoortMap" class="ng-scope">
                    <a class="right" data-ng-show="bijlage.UriThumbnailSmall">
                        <figure>
                            <!-- ngIf: bijlage.UriThumbnailSmall !== undefined --><img ng-if="bijlage.UriThumbnailSmall !== undefined" mg-http-src="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189029?fileType=thumbnailSmall" height="48" alt="" data-sm-preview="/api/leerlingen/16902/projecten/9395/onderdelen/40137/bijlagen/189029" data-show-preview="bijlage.MediaType === 2 &amp;&amp; bijlage.UriThumbnailSmall" data-preview-title="yellowcell.png" class="ng-scope" src="./ConnectFour_files/yellowcell.png"><!-- end ngIf: bijlage.UriThumbnailSmall !== undefined -->

                            <!-- ngIf: bijlage.UriThumbnailSmall === undefined -->
                        </figure>
                    </a>

                    <span class="icon-picture"></span>

                    <!-- bron, niet audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && !bijlage.IsAudioOrVideo -->

                    <!-- bron, wel audio/video -->
                    <!-- ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo --><a data-ng-click="bijlageClick(bijlage)" data-sm-open-linked-resource="getContentUri(bijlage)" data-ng-if="bijlage.ModuleSoort === 1 &amp;&amp; bijlage.IsAudioOrVideo" data-ng-bind="bijlage.Naam" class="ng-binding ng-scope">yellowcell.png</a><!-- end ngIf: bijlage.ModuleSoort === 1 && bijlage.IsAudioOrVideo -->

                    <!-- een href naar een pagina binnen de applicatie (elo opdracht) (hoeft niet via open-linked-resource directive) -->
                    <!-- ngIf: bijlage.ModuleSoort === 2 -->
                </div><!-- end ngIf: bijlage.ModuleSoort !== moduleSoortMap -->
            </li><!-- end ngRepeat: bijlage in localBronnen -->
        </ul><!-- end ngIf: localBronnen && localBronnen.length > 0 -->
        <footer class="endlink"></footer>
    </div>
</div>
                </li><!-- end ngRepeat: item in studiewijzer.Onderdelen.Items -->
            </ul>
        </div>
    </section>
    <aside class="ng-isolate-scope">
    <div class="head-bar">
        <ul class="tabs">
            <!-- ngRepeat: tab in vm.tabs --><li data-ng-show="tab.enabled" data-ng-class="{asideTrigger: true, active: tab.active}" data-ng-repeat="tab in vm.tabs" data-ng-click="vm.openTab(tab)" class="asideTrigger active">
                <a href="https://weredi.magister.net/magister/" class="ng-binding">Studiewijzers</a>
            </li><!-- end ngRepeat: tab in vm.tabs --><li data-ng-show="tab.enabled" data-ng-class="{asideTrigger: true, active: tab.active}" data-ng-repeat="tab in vm.tabs" data-ng-click="vm.openTab(tab)" class="asideTrigger">
                <a href="https://weredi.magister.net/magister/" class="ng-binding">Multimedia</a>
            </li><!-- end ngRepeat: tab in vm.tabs --><li data-ng-show="tab.enabled" data-ng-class="{asideTrigger: true, active: tab.active}" data-ng-repeat="tab in vm.tabs" data-ng-click="vm.openTab(tab)" class="asideTrigger">
                <a href="https://weredi.magister.net/magister/" class="ng-binding">Bronnen</a>
            </li><!-- end ngRepeat: tab in vm.tabs -->
        </ul>
    </div>
    <div class="content-container">
        <div class="sheets">
            <div ng-transclude="">
        <sm-tab title="Studiewijzers" id="idStudiewijzers" class="ng-scope ng-isolate-scope"><div class="tabsheet active" data-ng-class="{active: vm.tab.active}" id="idStudiewijzers">
    <div ng-transclude="">
            <div class="full-height widget ng-scope" data-studiewijzer-selectie="studiewijzer-selectie-directive">
    <div class="block">
        <h3><b class="ng-binding">Actueel</b></h3>
        <div class="content projects">
            <ul>
                <!-- ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi BVJ Max BB Antwoordenboeken</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t1 Inl. in de biologie</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t2 Voortplanting</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t3 Genetica</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t4 Evolutie</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t5 Ecologie</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V4 t6 Mens en milieu</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V5 t1 Regeling</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V5 t2 Waarneming &amp; gedrag</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V5 t3 Stofwisseling in de cel</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V5 t4 DNA</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">bi hoo Max V5 t5 Planten</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope selected">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">Inf DLF .HST .V5 20_21</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">Inf DLF 0.  Algemeen</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">Informatie ouders en leerlingen</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">MENTORLES_V5A</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">Natuurkunde 5 VWO</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">NE_V5</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">sk V5 KMP DHG CRB</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' --><li data-ng-repeat="studiewijzer in items | orderBy: &#39;Titel&#39;" data-ng-class="{&#39;selected&#39;: selectedId === studiewijzer.Id }" class="ng-scope">
                    <a data-ng-click="selectStudiewijzer(studiewijzer)">
                        <span class="ng-binding">WO_V5_2020</span>
                        <span class="ng-binding"></span>
                    </a>
                </li><!-- end ngRepeat: studiewijzer in items | orderBy: 'Titel' -->
            </ul>
        </div>
    </div>
</div>
        </div>
</div></sm-tab>
        <sm-tab title="Multimedia" id="idMultimedia" class="ng-scope ng-isolate-scope"><div class="tabsheet" data-ng-class="{active: vm.tab.active}" id="idMultimedia">
    <div ng-transclude="">
            <div class="widget ng-scope" data-studiewijzer-multimedia="studiewijzer-multimedia-directive">
	 <div class="block">
		 <h3><b>Multimedia</b></h3>
	     <div data-sm-studiewijzer-multimedia="studiewijzerMultimedia">
    <div class="content">
        <div ng-show="mediaType === 3">
            <img width="274" height="128" data-ng-src="assets/images/PlayerPlaceHolder.png" src="./ConnectFour_files/PlayerPlaceHolder.png">
        </div>
        <div ng-show="mediaType === 1" class="ng-hide">
            <video class="smVideo" width="274" height="128" controls="" autoplay=""></video>
        </div>
        <div ng-show="mediaType === 0" class="ng-hide">
            <audio controls="" autoplay=""></audio>
        </div>
    </div>
    <footer class="endlink">
        <a ng-show="mediaType === 1 || mediaType === 0" mg-download-file="" class="left ng-hide">download bestand</a>
    </footer>
</div>
	 </div>
</div>
        </div>
</div></sm-tab>
        <sm-tab title="Bronnen" id="idBronnen" class="ng-scope ng-isolate-scope"><div class="tabsheet" data-ng-class="{active: vm.tab.active}" id="idBronnen">
    <div ng-transclude="">
            <div class="full-height widget ng-scope" data-studiewijzer-bronnen="studiewijzer-bronnen-directive">
    <div class="block">
        <h3>Bronnen</h3>
        <!--<div data-loading-indicator=''></div>-->
        <div class="sources">
            <h3 data-ng-click="selectParent()">
                <span data-ng-show="navigationToParent()" class="glyph icon-back"></span>
                <b data-ng-bind="selectedBron.Naam" class="ng-binding">Bibliotheken</b>
            </h3>
            <div class="content-auto ng-isolate-scope" data-sm-loading-indicator="{domain: &#39;bronnen&#39;, className: &#39;icon-paper&#39;, overlay: false}"><img class="loading-image" alt="" src="data:image/gif;base64,R0lGODlhGAAYAPQKABui3zKq4mK+6bni9dXu+dzw+uf1/FG45ojO7hWe3nfH7Krc8+j2/GrC6obN7snp93jI7E+35lC35i6p4prW8cfo96fb86jb87Hf9Fu76JbU8HPF6zKr4lK455DR70ez5SH/C05FVFNDQVBFMi4wAwEAAAAh/i1NYWRlIGJ5IEtyYXNpbWlyYSBOZWpjaGV2YSAod3d3LmxvYWRpbmZvLm5ldCkAIfkECQUACgAsAAAAABgAGAAABcWgIo6jQVQVYZBsq1TaJhy0gAyrOxKIMNPAwGFT0SkGMh8wGBBeXJWNVLC5pE4aQbP5JBGk0kuOZNBsA8VRTDowKi5NgCD3lWLcIgRgf39LEWNGBgd7GwplbHgjegABBgYIkQSKIgMACQApkYCUCgRbAwUaCBqBeI8rZaQFnSwGFxoaaa0jA7FdtCKisbNuqCS2Fxesvo+uwhcYky6oxiwFwhgYFQXGjwXYzi0F0hgDAygoBOPVvhXf4OHjKpQm4Vfanc1uIQAh+QQJBQAZACwAAAAAGAAYAAAF32AmjiNDPA9hkGybPRTSzLPzuGxBKbQgNJGIRHHDPRAKHq0hkAgjB4zrCIEoHANCofC4NCRgySCHQCIGK5aBAg5EiiJLGQF3YSKBSYMhIszHOCMUAYSAA2UUaYEZDBKECowWFBR1iwiEEgxrkwWLJAOEAQ86k3yeIg+hAwySFoqeqQkBaBa1pqcDAACiGQO1BKciDgm7Kw8WGICeDAEACQ0iDAsDC8CnFs0LIxUD3beLBha3Bt0Do8Et5OYpDLeaBq8tDCj0WgXw7d8uJigE/vcG2qFjUMCflnzoWOhzEQIAIfkECQUAFgAsAAAAABgAFwAABdagJY6jURAEw5BsaxELhUC0oz0uayyOQ9OCRhBByL1kvR+t0cgEBy4ChdKjDFIMGEQgcEJJhqmG8lixGAvBISIojgZTijs3EEQiilEhRqkYRxR3EX4WDwuHfyMMDXcOIgOHc4mBbAZoh2aJFhURExEpkAOZiQSdEaIDqaN/BBOuqKqaj64ROA+pBbIWDq4SKwQDDziaDJ0TECIMwmWaDgkBE18vDxUpfxQTAAACmVnVBAY5CNoAE8OKKAQFKi0C2gkULibq6yqZD67xRgz19iRWsuyx+xMCACH5BAkFAAkALAAAAAAYABgAAAXVYCKOo2EUBGOQbJsUg6VpjqMthMsaw0w7CMRmqCnoXgufD+EYDhUVV2FhkS0qBRMM0XAOdgvq1cVzbnKjymCN1g02DYGjNAi3j5dGphFNENZ9RyIMEAICGiIPa0aCIwsHBxsMDBWVDI0jDwcdAgQGlRUrmH4dpaGgoyIEkAdRoKKYmpA5BLWXoxqQAisGtYyNDAIcAXMJvQRZmBoBzF8iJwW3RwvMARCwxibYJAwI1a0t2th/CAcA1RY62iUBAO7uAemCsAbt7wKBo/XnGwvbowNCHQkBACH5BAkFAAgALAAAAAAYABgAAAXTICKOpGEUJqmuCPMMVhwPBKsy1XDJXt8vBVtrsFhgZBaf78EyDJ5Pgun0SPoqKsMr2hx4FApPcER4mBlCxOML8Yy05nF6oIBAmIiCuZYWMTwNDRciBGUGfSMDgRpohVKIIg8CDQIEDIVyiAWUDUwFn5Aim5RYBgxooZKTNaYpkBYREQ2HU6h9Bg2xGm+ufbASEngivUIYwBIKabZvGrESB8IrFgEaAw8EA80TAQESGEIMAQkACdzm3AcLaRYA5OTnAQ1YaQYLDfDIA8t9Lk8P+yRCAAAh+QQJBQAHACwBAAAAFwAYAAAFyOAhjiNjMmSqHgzxDPAyPMVKti88LMvFDwYb7pGL8ShIgsrgItJOrQVFM1WSmAQCavVAIoOiVhZsI2gcjsuoUCCQbYcH2qE0FbbwMAW9YJ3yJAMOGxQGf4AjBBsbDncmiCWLG1qPkAcGiwpWliKKizWcIguLDm+QmIsaIw8CDogXAgIbFSIUAQAAFHkDAhmtIwO3CRMOeCUUGcmTJLa4Ex8OA1ldGx8fyQMqFBPDE97W4NYZ2VwZ3uff1pp5DAPV6RnRnAw5WnAhACH5BAkFAA8ALAAAAAAYABgAAAXH4COO5GOcZZqeBFG9FWGoa+vCQ17NtFnYsEoOQyzQToUkClkhXi7G0mlKI2CeFt6I2nsULBbNgMTtPiqadNSsWqTHbBVas2DEUwUNQmM/2e8GGg4aBQMBhwSACAgOLgCPcGwEiw4nAQkACHcDGxseMwqPB1o9Bh6dFiILjwmaZhidG4kPDAKHAQtdnJ0aJBW3ARqkIgYLsbIlFsACGjEuxgKxFW0RtwfX1xECGQ0bkSkVGxIB2NgCDY1mBgMIAuYbzXfENzI9IQAh+QQJBQAZACwAAAAAGAAYAAAF0WAmjqTIlGiaGQZTEHBxqiXLvvDzEDNt3y+dsJey9RgMgm4wMNCehQezOTJYnE/TtDLCAAKWrIiwGCxmjcSXSBtgLo9VAJBAiMeWyyDzCKj3dwwWgwYDcwFxgRYUV4YBiHcZDBSUUY8BgGIFlBQtEo92dw+UC04KjxJYT5MIDoCOARRiAwitBCYNEwERGE8PtQgLJA8RARISFGwrtBC1BSUDx8cNCzsvAw4Q2giJJRjSEQcCDeTk290oDxASBxENAuPmFM9ZDw7l8uhiBko7qighACH5BAkFABgALAAAAQAYABcAAAXVICaOJMacZ6mKA0WiZ8GsIzVNzwgXBVEYKwoAkBCoYoTkjFSZEAEOmiFZISxNgmHARTMRHg/CaHBLILojQ+VRWSpukSsaPBAzIrcoelQYDHIPEjcDezp+AwxkN2KFJoeJeBGMhYkLiASROY0MCwsXDAYCERFchQSdhBgOow1yXZ0LmgOjpIUVFBQWBSMQowKpNAS4FMAYBKIHAguuJg/DFK4DAhkCAhAXMgwELQgODhSTJAMN0w0NEOjo3d/hJQQI5ALn6d4XQHvODundC+17J0lkdAkBACH5BAkFABIALAAAAAAYABgAAAXVoCSOo1ENZKqWyxYAnLHOUiUAOBDIdGq9ucSuZOCpfgEO4IAYEEjFoqoSCSQRjFnUKDG4kpZet1DIigbWgEY8JhB4CKuASyu4ZQzB4bBmd91PBHsHFX5dFYgSD4NPhogVBot7jX6PBgQCHR2FfiaIBgwQmguGBQMDDyIaAgIbdDMnTiIVDRkNYWIEAwsDRggCDQoodbwDnCIEEBvLA2YpFRbRC3QDyxsNTQVFBRULGgsLFgUrD9bLDgga6uvidRrWCAgODuu9bATe8eoWA+OGXZfK9AgBACH5BAkFABUALAAAAAAYABgAAAXRYCWOI/MMw8OQbGsMihTMc7MYLfs09JwAP4AlN8LIej5gYEUcRCYzCWJAOCECQ+JDEolIKExSOBfzYogkA270OHgp6LR65Og2xmj1nNHoLuJyBisEDQIND4BpDCsPAoYFiSMFkxU7jpCRFQUEBAaEDYeZnpwVDAigZ5EGD6QVFIYIeERVD5gPELgDiQUPvWuuEAoIiGgmvQRiDgrCA78kBCgpzpUI1QgUtXrQ0c05D9YOFBQW5BYDCyjTJAULCOHiGuXSidAWFPHmD+pxagVzaCEAIfkEBQUAGAAsAAAAABcAGAAABc4gJo6jQQzDY5BsOziCJE2TBA1rOxKQFM204ETw0GEGMcnhJxMCJhRX5hdpUB6Ek2MGAASiu0ZMQMmRGI5JwjsYwQSNthFD6UJFD7HgMncTRxQNDQoMfToGDoILhjoFCoMEjC0EChCEkiIMmpQQEGaMmgwFCJ2RmKEMFJ1yoKEYFwgIFIWgBZoYBAgODkWGBgXAI7AOFKZGDFkEZqkUzb0tyFkFLATNzQsEqAUP3Fi0JNXXCwsoKNwV2UYGAxYLF+PlKel92wMX5d6Yma5GIQA7" style="display: none;">
                <ul class="list">
                    <!-- ngRepeat: bron in bronnen.mappen --><li data-ng-repeat="bron in bronnen.mappen" class="map ng-scope" data-ng-click="selectItem(bron)" id="-1">
                        <a data-ng-bind="bron.Naam" class="ng-binding">Mijn ELO-documenten</a>
                    </li><!-- end ngRepeat: bron in bronnen.mappen --><li data-ng-repeat="bron in bronnen.mappen" class="map ng-scope" data-ng-click="selectItem(bron)" id="-9">
                        <a data-ng-bind="bron.Naam" class="ng-binding">Gedeelde documenten</a>
                    </li><!-- end ngRepeat: bron in bronnen.mappen --><li data-ng-repeat="bron in bronnen.mappen" class="map ng-scope" data-ng-click="selectItem(bron)" id="-12">
                        <a data-ng-bind="bron.Naam" class="ng-binding">Portfolio documenten</a>
                    </li><!-- end ngRepeat: bron in bronnen.mappen --><li data-ng-repeat="bron in bronnen.mappen" class="map ng-scope" data-ng-click="selectItem(bron)" id="-18">
                        <a data-ng-bind="bron.Naam" class="ng-binding">Projectdocumenten</a>
                    </li><!-- end ngRepeat: bron in bronnen.mappen --><li data-ng-repeat="bron in bronnen.mappen" class="map ng-scope" data-ng-click="selectItem(bron)" id="-99">
                        <a data-ng-bind="bron.Naam" class="ng-binding">Prullenbak</a>
                    </li><!-- end ngRepeat: bron in bronnen.mappen -->
                    <!-- ngRepeat: bron in bronnen.bestanden | orderBy: 'Naam' -->
                </ul>
                <p class="empty-message ng-hide" data-ng-show="bronnen.mappen.length === 0 &amp;&amp; bronnen.bestanden.length === 0">Geen items in deze map.</p>
            </div>
        </div>
        <footer class="endlink ng-hide" data-ng-show="showAddBron">
            <a data-ng-click="addSelectedBron()" id="bronnen-toevoegen" data-ng-class="{&#39;active&#39;: selectedFile}" data-ng-bind="labelToevoegen" class="ng-binding"></a>
        </footer>
    </div>
</div>
        </div>
</div></sm-tab>
    </div>
        </div>
    </div>
</aside>
</div>
</div>
        </div>
        <mg-speech-bubble class="ng-isolate-scope"> <div class="speech-bubble-container">
                        <div class="speech-triangle-shadow"></div>
                        <div class="triangle-border-container">
                            <div class="speech-triangle-border"></div>
                        </div>
                        <div class="speech-bubble"></div>
                        <div class="speech-triangle"></div>
                    </div></mg-speech-bubble>
        <!-- ngIf: $root.isProductswitchVisible -->

        <link rel="stylesheet" href="./ConnectFour_files/zkq0zzv.css">
        <script type="text/javascript">
            (function(window, document, dataLayerName, id) {
            window[dataLayerName]=window[dataLayerName]||[],window[dataLayerName].push({start:(new Date).getTime(),event:"stg.start"});var scripts=document.getElementsByTagName('script')[0],tags=document.createElement('script');
            function stgCreateCookie(a,b,c){var d="";if(c){var e=new Date;e.setTime(e.getTime()+24*c*60*60*1e3),d="; expires="+e.toUTCString()}document.cookie=a+"="+b+d+"; path=/"}
            var isStgDebug=(window.location.href.match("stg_debug")||document.cookie.match("stg_debug"))&&!window.location.href.match("stg_disable_debug");stgCreateCookie("stg_debug",isStgDebug?1:"",isStgDebug?14:-1);
            var qP=[];dataLayerName!=="dataLayer"&&qP.push("data_layer_name="+dataLayerName),isStgDebug&&qP.push("stg_debug");var qPString=qP.length>0?("?"+qP.join("&")):"";
            tags.async=!0,tags.src="//iddinkgroup.containers.piwik.pro/"+id+".js"+qPString,scripts.parentNode.insertBefore(tags,scripts);
            !function(a,n,i){a[n]=a[n]||{};for(var c=0;c<i.length;c++)!function(i){a[n][i]=a[n][i]||{},a[n][i].api=a[n][i].api||function(){var a=[].slice.call(arguments,0);"string"==typeof a[0]&&window[dataLayerName].push({event:n+"."+i+":"+a[0],parameters:[].slice.call(arguments,1)})}}(i[c])}(window,"ppms",["tm","cm"]);
            })(window, document, 'dataLayer', window.globalSettings.piwikID);
        </script>

    <script type="text/javascript" src="./ConnectFour_files/app.9dd7a9410920c3f0e0d2.js.download"></script>

<iframe src="./ConnectFour_files/checksession.html" style="visibility: hidden; position: absolute; display: none; width: 0px; height: 0px;"></iframe><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 2, 'weredi']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 1, 'leerling']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(['setCustomUrl', 'https://weredi.magister.net/lo/vandaag']);
    _paq.push(['setDocumentTitle', 'Vandaag']);
    _paq.push(['trackPageView']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(['setDomains', ['www.magister.net']]);
    (function(p,i,w,ik) {
        var g=ik.createElement('script'),s=ik.getElementsByTagName('script')[0];
        _paq.push(['setTrackerUrl', p]);
        _paq.push(['setSiteId', w]);
        g.type='text/javascript';g.async=true;g.defer=true;g.src=i;s.parentNode.insertBefore(g,s);
    })('//iddinkgroup.piwik.pro/ppms.php','//iddinkgroup.piwik.pro/ppms.js','46fb0b98\u002D44b5\u002D4448\u002D8a43\u002D1b25d6058c53',document)
</script><noscript><p><img src="//iddinkgroup.piwik.pro/ppms.php?idsite=46fb0b98-44b5-4448-8a43-1b25d6058c53&rec=1&url=##pageUrl##" style="border:0" alt="" /></p></noscript><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 2, 'weredi']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 1, 'leerling']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(['setCustomUrl', 'https://weredi.magister.net/lo/elo/studiewijzer']);
    _paq.push(['setDocumentTitle', 'Studiewijzers']);
    _paq.push(['trackPageView']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 2, 'weredi']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(["setCustomDimension", 1, 'leerling']);
</script><script type="text/javascript">
    var _paq = _paq || [];
    _paq.push(['setCustomUrl', 'https://weredi.magister.net/lo/elo/studiewijzer/project/:studiewijzerId/:returnUrl?']);
    _paq.push(['setDocumentTitle', 'Studiewijzers']);
    _paq.push(['trackPageView']);
</script></body></html>