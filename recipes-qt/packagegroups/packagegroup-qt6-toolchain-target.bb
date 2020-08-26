DESCRIPTION = "Qt6 development packages"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"


RDEPENDS_${PN} += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qt3d-dev', '', d)} \
    qt5compat-dev \
    qtbase-dev \
    qtcoap-dev \
    qtconnectivity-dev \
    qtdeclarative-dev \
    qtgraphicaleffects-dev \
    qtimageformats-dev \
    qtmqtt-dev \
    qtnetworkauth-dev \
    qtopcua-dev \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtquick3d-dev', '', d)} \
    qtquick3d-dev \
    qtquickcontrols2-dev \
    qtquicktimeline-dev \
    qtremoteobjects-dev \
    qtserialbus-dev \
    qtserialport-dev \
    qtshadertools-dev \
    qtspeech-dev \
    qtsvg-dev \
    qttools-dev \
    qttranslations-dev \
    qtvirtualkeyboard-dev \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland-dev', '', d)} \
    qtwebchannel-dev \
    qtwebsockets-dev \
"
