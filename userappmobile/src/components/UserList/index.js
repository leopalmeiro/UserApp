import React, {Component} from 'react';

import {StyleSheet, View, Text, FlatList} from 'react-native';

import { ListItem } from 'react-native-elements';

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
]

class UserList extends Component {
  render() {
    return (
      <View style={styles.container}>
        <FlatList
          data={list}
          keyExtractor={item => item.name}
          renderItem={
          ({item}) => {
          return (
            <View>
              <Text>{item.name}</Text>
            </View>
          );
        }}
      />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default UserList;
