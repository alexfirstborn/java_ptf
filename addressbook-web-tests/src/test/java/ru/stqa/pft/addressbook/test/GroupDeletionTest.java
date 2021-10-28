package ru.stqa.pft.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().deleteSelectedGroups("delete");
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before - 1);
    app.logout();
  }
}