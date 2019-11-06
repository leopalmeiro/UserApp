import React, {Component} from 'react';
import {StyleSheet, FlatList,Text, View} from 'react-native';

import UserList from './components/UserList';

const list = [
  {
    name: 'Amy Farha',
    avatar_url:
      'https://s3.amazonaws.com/uifaces/faces/twitter/ladylexy/128.jpg',
    subtitle: 'Vice President',
  },
  {
    name: 'Chris Jackson',
    avatar_url:
      'https://s3.amazonaws.com/uifaces/faces/twitter/adhamdannaway/128.jpg',
    subtitle: 'Vice Chairman',
  },
];

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <UserList />
      </View>
    );
  }
}


const styles = StyleSheet.create({
container:{
  flex: 1,
  justifyContent: 'center',
  alignItems: 'center',
}

});
