'use strict';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'TextView',
    propTypes: {
        ...View.propTypes // include the default view properties
    },
};
var TextView = requireNativeComponent('RCTTextView', iface);

export default TextView;